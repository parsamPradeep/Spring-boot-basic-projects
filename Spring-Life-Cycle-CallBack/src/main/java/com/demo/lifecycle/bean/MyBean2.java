package com.demo.lifecycle.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import com.demo.lifecycle.otherbean.OtherBean;

public class MyBean2 implements InitializingBean, DisposableBean{
private OtherBean otherBean;

	@Override
	public void destroy() throws Exception {
		System.out.println("distroy()");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet");		
	}

	public void doSomething() {
		System.out.println("doSomething()");
	}
	@Autowired
	public void setOtherBean(OtherBean otherBean) {
		System.out.println("setOtherBean: "+ otherBean);
		this.otherBean=otherBean;
	}
}
