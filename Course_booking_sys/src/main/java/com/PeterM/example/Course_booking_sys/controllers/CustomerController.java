package com.PeterM.example.Course_booking_sys.controllers;

import com.PeterM.example.Course_booking_sys.modules.Customer;
import com.PeterM.example.Course_booking_sys.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value = "/customers")
    public ResponseEntity<List<Customer>> getAllCustomers(
        @RequestParam(name = "courseId", required = false) Long courseId,
        @RequestParam(name = "town", required = false) String town,
        @RequestParam(name = "age", required = false) Integer age
    ){
        if(courseId != null && town != null && age != null){
            return new ResponseEntity<>(customerRepository.findByTownIgnoreCaseAndAgeGreaterThanAndBookingsCourseId(town, age, courseId), HttpStatus.OK);
        }
        if(courseId != null && town != null){
            return new ResponseEntity<>(customerRepository.findByTownIgnoreCaseAndBookingsCourseId(town, courseId), HttpStatus.OK);
        }
        if(town != null) {
            return new ResponseEntity<>(customerRepository.findByTownIgnoreCase(town), HttpStatus.OK);
        }
        if(courseId != null){
            return new ResponseEntity<>(customerRepository.findByBookingsCourseId(courseId), HttpStatus.OK);
        }
        return new ResponseEntity<>(customerRepository.findAll(), HttpStatus.OK);
    }

    @GetMapping(value = "/customers/{id}")
    public ResponseEntity getCustomer(@PathVariable Long id){
        return new ResponseEntity(customerRepository.findById(id), HttpStatus.OK);
    }
}
