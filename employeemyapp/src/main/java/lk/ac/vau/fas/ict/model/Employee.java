package lk.ac.vau.fas.ict.model;

import java.util.List;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
 import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Employee extends Person{
	@Id
	private String empNo;
	private double salary;
	 
	@ManyToOne
	private Department department; //Established a relationship between department and employee (M->1)	
	@ManyToMany(mappedBy="employees")	
	private List<Project>project; 	
	@OneToOne
	private Insurance insurance;
		
}
