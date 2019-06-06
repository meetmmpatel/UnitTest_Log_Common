package com.junit.example;

import com.junitClass.example.UserService;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;


public class TestUserService {
  
  private UserService userService = null;
  
  @Before
  public void init() {
	userService = new UserService();
  }
  
  @Test
  public void logoutSuccess() {
	long userId = 1L;
	Assertions.assertTrue(userService.logout(userId));
	
  }
  
  @Test
  public void resetPasswordExistinguser() {
	long userId = 2L;
	Assertions.assertTrue(userService.resetPassword(userId));
	
  }
  
  @Test
  public void resetPasswordNotExistingUser() {
	long userId = 5L;
	Assertions.assertFalse(userService.resetPassword(userId));
	
  }
  
  
  @Nested
  @DisplayName("Testcase for Login ")
  class LoginFeature{
    
    @Test
	 void loginUserNameCorrect() throws IllegalAccessException {
      boolean actual = userService.login("admin","password123");
      Assertions.assertTrue(actual);
      
	}
  
  
  
  
  }
  
  
  
}
