package com.nt.service;

import java.util.List;

import com.nt.binding.Passenger;
import com.nt.binding.Ticket;

public interface TicketService {

	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getTicket(Integer tktId);
	
	public List<Ticket> getTickets();
}
