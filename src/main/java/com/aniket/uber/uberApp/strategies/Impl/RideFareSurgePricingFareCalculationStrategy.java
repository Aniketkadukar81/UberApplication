package com.aniket.uber.uberApp.strategies.Impl;

import com.aniket.uber.uberApp.dto.RideRequestDto;
import com.aniket.uber.uberApp.entities.RideRequest;
import com.aniket.uber.uberApp.strategies.RideFareCalculationStrategy;

public class RideFareSurgePricingFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public double calculateFare(RideRequest rideRequest) {
        return 0;
    }
}
