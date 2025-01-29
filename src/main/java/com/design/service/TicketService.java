package com.design.service;

import com.design.models.EntryGate;
import com.design.models.ParkingSpot;
import com.design.models.Ticket;
import com.design.models.Vehicle;
import com.design.repositories.ParkingLotRepository;
import com.design.strategies.SpotFindingStrategy.ParkingSpotFindingStrategy;

import java.util.Date;

public class TicketService {

    private ParkingSpotFindingStrategy parkingSpotFindingStrategy;
    private ParkingLotRepository parkingLotRepository;
    TicketService(ParkingSpotFindingStrategy parkingSpotFindingStrategy, ParkingLotRepository parkingLotRepository){
        this.parkingLotRepository = parkingLotRepository;
        this.parkingSpotFindingStrategy = parkingSpotFindingStrategy;
    }
    public Ticket generateTicket(Vehicle vehicle, EntryGate entryGate){

        ParkingSpot availableSpot = parkingSpotFindingStrategy.getAvailableSpot(vehicle.getVehicleType(),
                parkingLotRepository.getParkingLotWhereGateContains(entryGate));

        Ticket ticket = new Ticket();
        ticket.setVehicle(vehicle);
        ticket.setGate(entryGate);
        ticket.setEntryTime(new Date().toString());
        ticket.setGeneratedBy(entryGate.getOperator());
        ticket.setParkingSpot(availableSpot);

        return ticket;
    }
}


// Algo to generate Ticket :
// 1. Need to find a spot for vehicle
//2. Create a ticket object
// 3. Put all details inside ticket object
// 4. Return ticket