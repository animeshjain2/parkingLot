package com.design.repositories;

import com.design.models.Gates;
import com.design.models.ParkingLot;
import com.design.models.ParkingSpot;

import java.util.*;

public class ParkingLotRepository {

    private Map<Long, ParkingLot> parkingLotMap = new HashMap<>();
    private Map<Gates,ParkingLot> gateParkingLotMap = new HashMap<>();

    public ParkingLot save(ParkingLot parkingLot){
        parkingLotMap.put(parkingLot.getId(),parkingLot);
        for(Gates gate : parkingLot.getGates()){
            gateParkingLotMap.put(gate,parkingLot);
        }

        return parkingLot;
    }

    public ParkingLot getParkingLotWhereGateContains(Gates gate){
        if(gateParkingLotMap.containsKey(gate)){
            return gateParkingLotMap.get(gate);
        }

        return null;
    }

}
