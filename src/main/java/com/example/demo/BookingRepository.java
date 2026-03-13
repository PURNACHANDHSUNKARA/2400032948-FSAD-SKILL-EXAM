package com.example.demo;



import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.Booking;

public interface BookingRepository extends JpaRepository<Booking,Integer>
{

}
