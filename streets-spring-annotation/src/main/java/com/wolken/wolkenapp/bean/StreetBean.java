package com.wolken.wolkenapp.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Component
public class StreetBean {
	@Value("1")
	private int streetId;
	@Value("sampigeRoad")
	private String streetName;
	@Value("Malleshwaram")
	private String streetArea;
	@Autowired
	private PotholeBean potholeBean;

}
