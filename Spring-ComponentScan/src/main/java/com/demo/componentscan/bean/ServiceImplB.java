package com.demo.componentscan.bean;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

@Component()
public class ServiceImplB implements MyService{

	@PostConstruct
	private void init() {
		System.out.println("intializing lazily"+this.getClass().getSimpleName());
	}
	@Override
	public String getMessege() {
		
		return "messege from "+getClass().getSimpleName();
	}


}
