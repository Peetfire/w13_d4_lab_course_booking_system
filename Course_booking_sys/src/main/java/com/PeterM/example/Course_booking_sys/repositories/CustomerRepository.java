package com.PeterM.example.Course_booking_sys.repositories;

import com.PeterM.example.Course_booking_sys.modules.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

    List<Customer> findByBookingsCourseId(Long courseId);
    List<Customer> findByTownIgnoreCase(String town);
    List<Customer> findByTownIgnoreCaseAndBookingsCourseId(String town, Long courseId);
    List<Customer> findByTownIgnoreCaseAndAgeGreaterThanAndBookingsCourseId(String town, int age, Long courseId);
}
