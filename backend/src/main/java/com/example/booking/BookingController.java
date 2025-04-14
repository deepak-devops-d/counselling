package com.example.booking;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/booking")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    @PostMapping
    public Booking bookAppointment(@RequestBody Booking booking) {
    booking.setVideoRoom("counseling-session-" + UUID.randomUUID().toString());
    return bookingService.save(booking);
    }

    }

    @GetMapping("/{counselorEmail}")
    public List<Booking> getCounselorBookings(@PathVariable String counselorEmail) {
        return bookingService.getAllForCounselor(counselorEmail);
    }
}

