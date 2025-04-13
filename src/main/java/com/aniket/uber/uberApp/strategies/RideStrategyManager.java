package com.aniket.uber.uberApp.strategies;

import com.aniket.uber.uberApp.strategies.Impl.DriverMatchingHighestRatedDriverStrategy;
import com.aniket.uber.uberApp.strategies.Impl.DriverMatchingNearestDriverStrategy;
import com.aniket.uber.uberApp.strategies.Impl.RideFareDefaultFareCalculationStrategy;
import com.aniket.uber.uberApp.strategies.Impl.RideFareSurgePricingFareCalculationStrategy;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@RequiredArgsConstructor
public class RideStrategyManager {

    private final DriverMatchingHighestRatedDriverStrategy highestRatedDriverStrategy;
    private final DriverMatchingNearestDriverStrategy nearestDriverStrategy;
    private final RideFareDefaultFareCalculationStrategy fareDefaultFareCalculationStrategy;
    private final RideFareSurgePricingFareCalculationStrategy surgePricingFareCalculationStrategy;

    public DriverMatchingStrategy driverMatchingStrategy(double riderRating){
        if (riderRating >=4.8){
            return highestRatedDriverStrategy;
        }else {
            return nearestDriverStrategy;
        }
    }

    public RideFareCalculationStrategy rideFareCalculationStrategy(){

        LocalTime surgeStartTime =  LocalTime.of(18,0);
        LocalTime surgeEndTime =  LocalTime.of(21,0);
        LocalTime currentTime =  LocalTime.now();

        boolean isSurgeTime = currentTime.isAfter(surgeStartTime) && currentTime.isBefore(surgeEndTime);

        if(isSurgeTime){
            return surgePricingFareCalculationStrategy;
        }else {
            return fareDefaultFareCalculationStrategy;
        }

    }
}
