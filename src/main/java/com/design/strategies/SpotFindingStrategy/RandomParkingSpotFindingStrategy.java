package com.design.strategies.SpotFindingStrategy;

import com.design.models.*;
import com.design.service.ParkingSpotVehicleTypeMatchingService;

public class RandomParkingSpotFindingStrategy implements ParkingSpotFindingStrategy{

    private ParkingSpotVehicleTypeMatchingService parkingSpotVehicleTypeMatchingService;

    public RandomParkingSpotFindingStrategy(ParkingSpotVehicleTypeMatchingService parkingSpotVehicleTypeMatchingService){
        this.parkingSpotVehicleTypeMatchingService = parkingSpotVehicleTypeMatchingService;
    }

    @Override
    public ParkingSpot getAvailableSpot(VehicleType vehicleType, ParkingLot parkingLot) {

        for(ParkingFloor floor : parkingLot.getParkingFloors()){
            for(ParkingSpot spot : floor.getParkingSpots()){
                if(spot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE) &&
                parkingSpotVehicleTypeMatchingService.matches(spot.getSpotType(),vehicleType)){
                    return spot;
                }
            }
        }

        return null;
    }
}
