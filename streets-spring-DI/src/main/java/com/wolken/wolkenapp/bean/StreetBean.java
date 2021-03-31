package com.wolken.wolkenapp.bean;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor

public class StreetBean {
	
	private int streetId;
	private String streetName;
	private String streetArea;
	private String pincode;
	private PotholeBean potholeBean;
	
	public void drive() {
		System.out.println("Driving");
	}
	

}
