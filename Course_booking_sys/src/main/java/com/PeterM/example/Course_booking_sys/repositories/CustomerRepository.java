package com.PeterM.example.Course_booking_sys.repositories;

import com.PeterM.example.Course_booking_sys.modules.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
