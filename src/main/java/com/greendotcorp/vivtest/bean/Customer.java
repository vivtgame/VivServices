package com.greendotcorp.vivtest.bean;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown=true)
public class Customer{
	@JsonProperty("id") 
	int id;
	
	@JsonProperty("customerName") 
	String customerName;	
	
	@JsonCreator
	public Customer(@JsonProperty("id") int id, @JsonProperty("customerName") String customerName) {
		super();
		this.id = id;
		this.customerName = customerName;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}	
	
}