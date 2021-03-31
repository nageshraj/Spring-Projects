package com.wolken.wolkenapp.bean;

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
public class PotholeBean {
	@Value("2")
	private int noOfPotholes;
	@Value("1*2")
	private String area;

}
