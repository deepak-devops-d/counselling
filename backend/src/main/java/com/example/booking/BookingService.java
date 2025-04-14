package com.example.booking;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookingService {

    private final BookingRepository bookingRepo;

    public BookingService(BookingRepository bookingRepo) {
        this.bookingRepo = bookingRepo;
    }

    public Booking save(Booking booking) {
        return bookingRepo.save(booking);
    }

    public List<Booking> getAllForCounselor(String email) {
        return bookingRepo.findByCounselorEmail(email);
    }
}

