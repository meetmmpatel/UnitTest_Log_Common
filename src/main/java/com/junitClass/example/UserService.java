package com.junitClass.example;

import org.apache.commons.lang.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UserService {
  
  //Login
  
  public boolean login(String userName, String password) throws IllegalAccessException {
	if (StringUtils.isBlank(userName) || StringUtils.isBlank(password)) {
	  throw new IllegalAccessException("Username or Password must not null or empty");
	  
	} else if (userName.equals("admin") && password.equals("password123")) {
	  return true;
	}
	return false;
	
  }
  
  public boolean changePassword(long userId, String oldPassword, String newPassword) {
	
	if (userId == 1 && StringUtils.isNotBlank(newPassword) &&
			StringUtils.isNotBlank(newPassword) && !newPassword.equals(oldPassword)) {
	  return true;
	}
	return false;
  }
  
  public boolean resetPassword(long userId) {
	
	List<Long> existingUsers = new ArrayList<>(Arrays.asList(1L, 2L, 3L));
	if (existingUsers.contains(userId)) {
	  return true;
	}
	return false;
  }
  
  public boolean logout(long userId) {
	
	List<Long> existingUsers = new ArrayList<>(Arrays.asList(1L, 2L, 3L));
	if (existingUsers.contains(userId)) {
	  System.out.println("LogOut...");
	}
	
	return true;
  }
  
  
}




