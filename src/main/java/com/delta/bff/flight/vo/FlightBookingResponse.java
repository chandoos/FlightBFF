package com.delta.bff.flight.vo;

import com.delta.bff.flight.model.TripPlan;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FlightBookingResponse {
    private String pnr;
    private TripPlan plannedTrip;
}
