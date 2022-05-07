package com.delta.bff.flight.model;

import lombok.Data;

@Data
public class Flight {
    private String number;
    private String make;
    private String model;
    private int capacity;
}
