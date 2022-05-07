package com.delta.bff.flight.model;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
public class TripPlan {
    private String origin;
    private String destination;
    private LocalDate departureDate;
    private LocalDateTime departureTs;
    private String dayOfTrip;
    private LocalDate arrivalDate;
    private LocalDateTime arrivalTs;
    private Flight flight;
}
