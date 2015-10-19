package com.cisc181.core;

public class PersonException extends Exception {
	public Person Person;
	
	public PersonException(Person Person){
		super("Error");
		this.Person = Person;		
	}
}
