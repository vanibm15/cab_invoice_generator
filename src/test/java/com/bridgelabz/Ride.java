package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Ride {
    private final double distance;
    private final int time;

    public Ride(double distance, int time) {
this.distance=distance;
this.time=time;
    }
}
    @Test
    void givenLessDistanceAndTimeShouldReturnMinimumFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        double distance = 0.1;
        int time = 1;
        double fare = invoiceGenerator.calculateFare(distance, time);
        Assertions.assertEquals(5, fare, 0.0);
    }

    @Test
    void givenMultipleRides_ShouldReturnTotalFare() {
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        Ride[] rides = {
                new Ride(2.0, 5),
                new Ride(0.1, 1),
        };
        double totalFare = invoiceGenerator.calculateFare();
        Assertions.assertEquals(30, totalFare, 0.0);
    }
}



private static final double MINIMUM_FARE = 5;

        if (totalFare < MINIMUM_FARE) {
        return MINIMUM_FARE;
        } else {
        return totalFare;
        }