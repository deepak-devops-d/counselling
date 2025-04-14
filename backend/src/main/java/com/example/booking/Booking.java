package com.example.booking;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userEmail;
    private String counselorEmail;
    private LocalDateTime appointmentTime;
    private String videoRoom;

    // Getters and setters
}

