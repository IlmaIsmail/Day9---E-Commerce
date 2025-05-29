package lk.ac.vau.fas.ict.model;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;

@Entity
public class Insurance {
	@Id
	@Column(name="insurance_id")
	private int id;
	@Column(nullable=false)
	private String name;
	private String type;
	private long cost;
	
	@OneToOne
	private Employee employee;
	
	
}
