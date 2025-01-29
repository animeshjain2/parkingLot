package com.design.strategies.SpotFindingStrategy;

import com.design.models.ParkingLot;
import com.design.models.ParkingSpot;
import com.design.models.Vehicle;
import com.design.models.VehicleType;

public interface ParkingSpotFindingStrategy {

    ParkingSpot getAvailableSpot(VehicleType vehicleType, ParkingLot parkingLot);
}
