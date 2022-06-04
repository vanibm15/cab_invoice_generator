package com.bridgelabz;

import static java.sql.Types.TIME;

public class InvoiceGenerator<Ride> {
    private static final double MINIMUM_COST_PER_KILOMETER = 10.0;
    private static final int COST_PER_TIME = 1;


    public static double calculateFare(double distance, int time) {
        return distance * MINIMUM_COST_PER_KILOMETER + time * COST_PER_TIME;



    }
    public double calculateFare(Ride[] rides) {
        double totalFare = 0;
        for (Ride ride:rides) {
            totalFare += this.calculateFare(ride.distance, ride.time);
        }
        return totalFare;
    }


}
