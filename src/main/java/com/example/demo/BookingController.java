package com.example.demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/booking")
public class BookingController 
{
    @Autowired
    BookingService service;

    // POST
    @PostMapping("/add")
    public Booking addBooking(@RequestBody Booking b)
    {
        return service.addBooking(b);
    }

    // DELETE
    @DeleteMapping("/delete/{id}")
    public String deleteBooking(@PathVariable int id)
    {
        return service.deleteBooking(id);
    }
}