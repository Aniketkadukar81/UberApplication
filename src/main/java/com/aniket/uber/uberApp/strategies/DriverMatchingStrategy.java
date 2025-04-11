package com.aniket.uber.uberApp.strategies;

import com.aniket.uber.uberApp.dto.RideRequestDto;
import com.aniket.uber.uberApp.entities.Driver;
import com.aniket.uber.uberApp.entities.RideRequest;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequest rideRequest);
}
