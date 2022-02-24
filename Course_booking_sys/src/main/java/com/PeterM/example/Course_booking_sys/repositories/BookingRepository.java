package com.PeterM.example.Course_booking_sys.repositories;

import com.PeterM.example.Course_booking_sys.modules.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
