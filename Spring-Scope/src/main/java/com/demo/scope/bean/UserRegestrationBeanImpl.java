package com.demo.scope.bean;

import java.util.LinkedHashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.demo.scope.services.RegestrationService;
import com.demo.scope.services.UserInfo;

public class UserRegestrationBeanImpl implements UserRegetrationBean{
@Autowired
private RegestrationService regestrationService;

@Autowired
private UserRegetrationValidation userRegetrationValidation;

private UserInfo userInfo;

@PostConstruct
private void intialize() {
	System.out.println("Identifying hashcode:"+System.identityHashCode(this));
}
@Override
public Map<String,String> validate(){
	if (userInfo==null) {
		throw new RuntimeException("UserInfo must be set before calling validate methode");
	}
	Map<String, String> errors=new LinkedHashMap<>();
	
	String errorMessege=userRegetrationValidation.validateEmail(userInfo.getEmail());
	if (errorMessege != null) {
        errors.put(KEY_EMAIL, errorMessege);
    }

	errorMessege = userRegetrationValidation.validatePassword(userInfo.getPassword());
    if (errorMessege != null) {
        errors.put(KEY_PASSWORD, errorMessege);
    }

    return errors;
}
@Override
public void regester() {
	regestrationService.regester(userInfo);
	
}
@Override
public void setUserInfo(UserInfo userInfo) {
	this.userInfo=userInfo;
	
}


}
