package com.design.service;

import com.design.models.SpotType;
import com.design.models.VehicleType;

public class ParkingSpotVehicleTypeMatchingService {

    public boolean matches(SpotType spotType, VehicleType vehicleType){
        return switch (spotType){
            case LARGE -> vehicleType.equals(VehicleType.LARGE);
            case SMALL -> vehicleType.equals(VehicleType.SMALL);
            case ELECTRIC ->  vehicleType.equals(VehicleType.ELECTRIC);
            case MEDIUM ->  vehicleType.equals(VehicleType.MEDIUM);
        };
    }
}
