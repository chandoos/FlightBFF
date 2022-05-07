package com.delta.bff.flight.controller;

import com.delta.bff.flight.model.TripPlan;
import com.delta.bff.flight.vo.FlightBookingResponse;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Slf4j
@RestController
@RequestMapping("/flight")
public class FlightBookingController {

    @ApiOperation(value = "This service used to get Flights information for a given PNR number ", response = Iterable.class, tags = "getFlightInformation")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success|OK"),
            @ApiResponse(code = 401, message = "Not Authorized!"),
            @ApiResponse(code = 403, message = "Forbidden!"),
            @ApiResponse(code = 404, message = "Not found!") })
    @GetMapping("/getFlightInformation/{pnr}")
    public FlightBookingResponse getFlightInformation(@Validated @PathVariable("pnr") String pnr){
        if(log.isInfoEnabled()){
            log.info("Inside Service getFlightInformation Start");
        }
        FlightBookingResponse flightBookingResponse = new FlightBookingResponse(pnr, getFlightTripPlan());
        if(log.isInfoEnabled()){
            log.info("Inside Service getFlightInformation End");
        }
        return flightBookingResponse;
    }

    private TripPlan getFlightTripPlan(){
        TripPlan tripPlan = new TripPlan();
        tripPlan.setDayOfTrip("MON");
        tripPlan.setOrigin("ATL");
        tripPlan.setDestination("NYC");
        tripPlan.setDepartureDate(LocalDate.now());
        tripPlan.setDepartureTs(LocalDateTime.now());
        tripPlan.setArrivalDate(LocalDate.now());
        tripPlan.setArrivalTs(LocalDateTime.now());
        return tripPlan;
    }
}


