package com.wolken.wolkenapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wolken.wolkenapp.bean.PotholeBean;
import com.wolken.wolkenapp.bean.StreetBean;

public class StreetTester {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");

		StreetBean streetBean = applicationContext.getBean(StreetBean.class);

		System.out.println(streetBean);
		System.out.println(streetBean.getStreetName());

		PotholeBean potholeBean = applicationContext.getBean(PotholeBean.class);
		System.out.println(potholeBean);
		System.out.println(potholeBean.getNoOfPotholes());
	}
	
}
