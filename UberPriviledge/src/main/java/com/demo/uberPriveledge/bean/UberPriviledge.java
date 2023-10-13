package com.demo.uberPriveledge.bean;

 
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UberPriviledge {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer priviledgeId;
	
	private String priviledgeType;
	private String currentDiscount;
	private String paymentMode;
	
	public Integer getPriviledgeId() {
		return priviledgeId;
	}
	public void setPriviledgeId(Integer priviledgeId) {
		this.priviledgeId = priviledgeId;
	}
	public String getPriviledgeType() {
		return priviledgeType;
	}
	public void setPriviledgeType(String priviledgeType) {
		this.priviledgeType = priviledgeType;
	}
	public String getCurrentDiscount() {
		return currentDiscount;
	}
	public void setCurrentDiscount(String currentDiscount) {
		this.currentDiscount = currentDiscount;
	}
	public String getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		this.paymentMode = paymentMode;
	}
	
	 
	
	
}
