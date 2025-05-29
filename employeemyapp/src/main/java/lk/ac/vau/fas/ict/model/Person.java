package lk.ac.vau.fas.ict.model;

import jakarta.persistence.MappedSuperclass;

//This class is not needed in the database because its an Abstract class inherited by Employee. so we can use this annotation

@MappedSuperclass
public class Person {
	private String name;
	private int age;
	private String gender;
	
	
	
	
	
	
	
	
}
