package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nt.binding.Ticket;

@Repository
public interface TicketRepository extends JpaRepository<Ticket,Integer>{

}
