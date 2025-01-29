package com.design.dto;

import com.design.models.EntryGate;
import com.design.models.Vehicle;

public class GenerateTicketRequestDto {
    private EntryGate entryGate;
    private Vehicle vehicle;

    public EntryGate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(EntryGate entryGate) {
        this.entryGate = entryGate;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
