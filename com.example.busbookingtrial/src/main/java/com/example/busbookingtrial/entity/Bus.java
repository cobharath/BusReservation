package com.example.busbookingtrial.entity;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "Bused")
public class Bus extends Identifier {
	
	
	private String currentCity;
	private String destinationCity;
	private String dateOfDestination;

	

	
	public String getCurrentCity() {
		return currentCity;
	}
	public void setCurrentCity(String currentCity) {
		this.currentCity = currentCity;
	}
	public String getDestinationCity() {
		return destinationCity;
	}
	public void setDestinationCity(String destinationCity) {
		this.destinationCity = destinationCity;
	}
	public String getDateOfDestination() {
		return dateOfDestination;
	}
	public void setDateOfDestination(String dateOfDestination) {
		this.dateOfDestination = dateOfDestination;
	}
	
	
	
	

	

}
