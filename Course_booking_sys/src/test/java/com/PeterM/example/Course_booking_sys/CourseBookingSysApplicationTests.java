package com.PeterM.example.Course_booking_sys;

import com.PeterM.example.Course_booking_sys.modules.Booking;
import com.PeterM.example.Course_booking_sys.modules.Course;
import com.PeterM.example.Course_booking_sys.modules.Customer;
import com.PeterM.example.Course_booking_sys.repositories.BookingRepository;
import com.PeterM.example.Course_booking_sys.repositories.CourseRepository;
import com.PeterM.example.Course_booking_sys.repositories.CustomerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CourseBookingSysApplicationTests {
	@Autowired
	CustomerRepository customerRepository;
	@Autowired
	CourseRepository courseRepository;
	@Autowired
	BookingRepository bookingRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canAddABooking(){
		Course course = new Course("Learn Java", "Edinburgh", 5);
		courseRepository.save(course);
		Customer customer = new Customer("Bob", "Edinburgh", 99);
		customerRepository.save(customer);
		Booking booking = new Booking("28-02-22", course, customer);
		bookingRepository.save(booking);
	}

}
