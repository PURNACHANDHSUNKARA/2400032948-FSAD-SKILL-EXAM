package com.example.demo;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Booking;
import com.example.demo.BookingRepository;

@Service
public class BookingService 
{
    @Autowired
    BookingRepository repo;

    public Booking addBooking(Booking b)
    {
        return repo.save(b);
    }

    public String deleteBooking(int id)
    {
        repo.deleteById(id);
        return "Booking Deleted";
    }
}
