package com.demo.uberDriver.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UberDriver {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer driverId;
   
	private String driverName;
	private Integer vehicalNumber;
	
	public Integer getDriverId() {
		return driverId;
	}
	public void setDriverId(Integer driverId) {
		this.driverId = driverId;
	}
	public String getDriverName() {
		return driverName;
	}
	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}
	public Integer getVehicalNumber() {
		return vehicalNumber;
	}
	public void setVehicalNumber(Integer vehicalNumber) {
		this.vehicalNumber = vehicalNumber;
	}	
}
