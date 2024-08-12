package com.nt.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Ticket {

	@Id
	@GeneratedValue(strategy  = GenerationType.IDENTITY)
	private Integer tktId;
	private String tktStatus;
	private String trainNum;
	private String name;
	private String dob;
	private String gender;
	private String doj;
	private String source;
	private String destination;
}
