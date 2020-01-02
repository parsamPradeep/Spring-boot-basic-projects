package com.demo.lazyloading.bean;

import javax.annotation.PostConstruct;

public class AlwaysUsingBean {
	@PostConstruct
	public void init() {
		System.out.println("always using bean");
	}

}
