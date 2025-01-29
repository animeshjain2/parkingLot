package com.design.controller;

import com.design.dto.GenerateTicketRequestDto;
import com.design.dto.GenerateTicketResponseDto;
import com.design.models.Ticket;
import com.design.service.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto requestDto){

        Ticket ticket = ticketService.generateTicket(requestDto.getVehicle(),requestDto.getEntryGate());

        GenerateTicketResponseDto responseDto = new GenerateTicketResponseDto();
        responseDto.setTicket(ticket);

        return responseDto;
    }
}
