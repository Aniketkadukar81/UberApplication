package com.aniket.uber.uberApp.strategies.Impl;

import com.aniket.uber.uberApp.dto.RideRequestDto;
import com.aniket.uber.uberApp.entities.Driver;
import com.aniket.uber.uberApp.entities.Ride;
import com.aniket.uber.uberApp.entities.RideRequest;
import com.aniket.uber.uberApp.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequest rideRequest) {
        return List.of();
    }
}
