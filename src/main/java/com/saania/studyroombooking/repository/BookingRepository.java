package com.saania.studyroombooking.repository;

import com.saania.studyroombooking.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
