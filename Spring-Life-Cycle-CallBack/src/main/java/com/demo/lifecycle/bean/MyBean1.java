package com.demo.lifecycle.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.lifecycle.otherbean.OtherBean;

public class MyBean1 {
private OtherBean otherBean;
	
	public MyBean1() {
		System.out.println("my bean constructor: "+ this);
	}
	
	public void doSomething() {
		System.out.println("do something"); 
	}
	
	
	public void myPostConstructor() {
		System.out.println("myPostConstructors");
	}
	
	@Autowired
	public void setOtherBean(OtherBean otherBean) {
		System.out.println("setOtherBean(): "+otherBean);
		this.otherBean=otherBean;
	}

	
	public void cleanUp() {
		System.out.println("clean up");
	}
}
