package com.demo.scope.bean;

import java.util.Map;

import com.demo.scope.services.UserInfo;

public interface UserRegetrationBean {
	public static String KEY_EMAIL="email";
	public static String KEY_PASSWORD="password";
	/**
	 * 
	 * @param userInfo
	 */
	void setUserInfo(UserInfo userInfo);
	/**
	 * 
	 * @return
	 * 
	 */
	Map<String,String> validate();
		
	void regester();


}
