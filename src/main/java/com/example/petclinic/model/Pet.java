package com.example.petclinic.model;

import java.time.LocalDate;

public class Pet {
	
	private PetType PetType;
	private Owner owner;
	private LocalDate localDate;
	
	public PetType getPetType() {
		return PetType;
	}
	public void setPetType(PetType petType) {
		PetType = petType;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public LocalDate getLocalDate() {
		return localDate;
	}
	public void setLocalDate(LocalDate localDate) {
		this.localDate = localDate;
	}
	
    
}
