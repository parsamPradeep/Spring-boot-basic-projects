package com.demo.scope.services;

import javax.annotation.PostConstruct;

public class RegestrationServiceImpl implements RegestrationService {

	@PostConstruct
	public void init() {
		System.out.println("intializing :"+System.identityHashCode(this));
	}
	
	@Override
	public void regester(UserInfo userInfo) {
		// TODO Auto-generated method stub
		System.out.println("user has been regesterd successfully"+ userInfo);
	}

}
