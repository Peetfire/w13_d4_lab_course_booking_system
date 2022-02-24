package com.PeterM.example.Course_booking_sys.components;

import com.PeterM.example.Course_booking_sys.modules.Booking;
import com.PeterM.example.Course_booking_sys.modules.Course;
import com.PeterM.example.Course_booking_sys.modules.Customer;
import com.PeterM.example.Course_booking_sys.repositories.BookingRepository;
import com.PeterM.example.Course_booking_sys.repositories.CourseRepository;
import com.PeterM.example.Course_booking_sys.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    BookingRepository bookingRepository;

    public void run(ApplicationArguments args) {
        Course course = new Course("Learn Java", "Edinburgh", 5);
        courseRepository.save(course);
        Course course1 = new Course("Learn Python", "Edinburgh", 3);
        courseRepository.save(course1);
        Course course2 = new Course("Learn SQL", "Glasgow", 1);
        courseRepository.save(course2);
        Course course3 = new Course("Learn Spring", "Aberdeen", 2);
        courseRepository.save(course3);

        Customer customer = new Customer("Bob", "Edinburgh", 99);
        customerRepository.save(customer);
        Customer customer1 = new Customer("Jane", "Glasgow", 98);
        customerRepository.save(customer1);
        Customer customer2 = new Customer("Asif", "Aberdeen", 97);
        customerRepository.save(customer2);
        Customer customer3 = new Customer("Habiba", "Edinburgh", 100);
        customerRepository.save(customer3);


        Booking booking = new Booking("28-02-22", course, customer);
        bookingRepository.save(booking);
        Booking booking1 = new Booking("28-02-22", course1, customer);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("28-02-22", course2, customer);
        bookingRepository.save(booking2);
        Booking booking3 = new Booking("28-02-22", course3, customer);
        bookingRepository.save(booking3);

        Booking booking4 = new Booking("20-02-22", course, customer1);
        bookingRepository.save(booking4);
        Booking booking5 = new Booking("21-02-22", course3, customer1);
        bookingRepository.save(booking5);

        Booking booking6 = new Booking("12-02-22", course2, customer2);
        bookingRepository.save(booking6);
        Booking booking7 = new Booking("19-02-22", course1, customer2);
        bookingRepository.save(booking7);

        Booking booking8 = new Booking("01-02-22", course1, customer3);
        bookingRepository.save(booking8);
        Booking booking9 = new Booking("18-02-22", course3, customer3);
        bookingRepository.save(booking9);
        Booking booking10 = new Booking("20-02-22", course, customer3);
        bookingRepository.save(booking10);
    }
}
