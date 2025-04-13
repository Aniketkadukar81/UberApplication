package com.aniket.uber.uberApp.services;

import com.aniket.uber.uberApp.dto.DriverDto;
import com.aniket.uber.uberApp.dto.RideDto;
import com.aniket.uber.uberApp.dto.RideRequestDto;
import com.aniket.uber.uberApp.dto.RiderDto;
import com.aniket.uber.uberApp.entities.Rider;
import com.aniket.uber.uberApp.entities.User;

import java.util.List;

public interface RiderService {

    RideRequestDto requestRide(RideRequestDto rideRequestDto);

    RideDto cancelRide(Long rideId);

    DriverDto rateDriver(Long rideId, Integer rating);

    RiderDto getMyProfile();

    List<RideDto> getAllMyRides();

    Rider createNewRider(User user);

    Rider getCurrentRider();
}
