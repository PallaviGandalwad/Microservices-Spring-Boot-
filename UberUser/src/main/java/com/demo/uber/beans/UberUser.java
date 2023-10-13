package com.demo.uber.beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UberUser {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userId;
	
	private String userName;
	private String userCity;
	private String userLocation;
	
	//UberDriver UberDriverId;
	private Integer uberDriverId ;
	
	//UberPriviledge UberPriviledgeId;
	private Integer uberPriviledgeId;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserCity() {
		return userCity;
	}

	public void setUserCity(String userCity) {
		this.userCity = userCity;
	}

	public String getUserLocation() {
		return userLocation;
	}

	public void setUserLocation(String userLocation) {
		this.userLocation = userLocation;
	}

	public Integer getUberDriverId() {
		return uberDriverId;
	}

	public void setUberDriverId(Integer uberDriverId) {
		this.uberDriverId = uberDriverId;
	}

	public Integer getUberPriviledgeId() {
		return uberPriviledgeId;
	}

	public void setUberPriviledgeId(Integer uberPriviledgeId) {
		this.uberPriviledgeId = uberPriviledgeId;
	}
}
