package com.nt.service;

import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.binding.Passenger;
import com.nt.binding.Ticket;
import com.nt.repo.TicketRepository;

@Service
public class TicketServiceImpl implements TicketService {

	@Autowired
	private TicketRepository repo;
	
	@Override
	public Ticket bookTicket(Passenger passenger){
		Ticket t=new Ticket();
		BeanUtils.copyProperties(passenger, t);
		t.setTktStatus("confirmed");
		Ticket savedTkt=repo.save(t);
		return savedTkt;
	}
	
	@Override
	public Ticket getTicket(Integer tktId) {
		return repo.findById(tktId).orElseThrow();
	}
	
	public List<Ticket>  getTickets(){
	    return repo.findAll();
	}
}
