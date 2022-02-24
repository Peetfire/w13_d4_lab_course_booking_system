package com.PeterM.example.Course_booking_sys.repositories;

import com.PeterM.example.Course_booking_sys.modules.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {

    List<Course> findByBookingsCustomerId(Long customerid);
    List<Course> findByRating(Integer rating);
}
