package com.aniket.uber.uberApp.strategies;

import com.aniket.uber.uberApp.dto.RideRequestDto;
import com.aniket.uber.uberApp.entities.RideRequest;

public interface RideFareCalculationStrategy {

    double RIDE_FARE_MULTIPLIER =10;

    double calculateFare(RideRequest rideRequest);
}
