package com.aniket.uber.uberApp.services.impl;

import com.aniket.uber.uberApp.dto.DriverDto;
import com.aniket.uber.uberApp.dto.RideDto;
import com.aniket.uber.uberApp.dto.RideRequestDto;
import com.aniket.uber.uberApp.dto.RiderDto;
import com.aniket.uber.uberApp.entities.Driver;
import com.aniket.uber.uberApp.entities.Ride;
import com.aniket.uber.uberApp.entities.enums.RideStatus;
import com.aniket.uber.uberApp.services.RideService;
import com.aniket.uber.uberApp.services.RiderService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RideServiceImpl implements RideService {

    @Override
    public Ride getRideById(Long rideId) {
        return null;
    }

    @Override
    public void matchWithDrivers(RideRequestDto rideRequestDto) {

    }

    @Override
    public Ride createNewRide(RideRequestDto rideRequestDto, Driver driver) {
        return null;
    }

    @Override
    public Ride updateRideStatus(Long rideId, RideStatus rideStatus) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfRider(Long riderId, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<Ride> getAllRidesOfDriver(Long driverId, PageRequest pageRequest) {
        return null;
    }
}
