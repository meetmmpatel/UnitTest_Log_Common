package com.junit.example;

import org.junit.Test;
import org.junit.jupiter.api.*;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;



public class JunitAnnotations {
  
  
  @BeforeAll
  public static void initAll(){
	System.out.println("This is Before all ...");
  }
  
  @BeforeEach
  public void init(){
	System.out.println("This is Before Each method");
  }
  
  
  @Test
  @DisplayName("First Test")
  @RepeatedTest(5)
  public void testMethodOne(){
	System.out.println("..Test method one");
  }
  
  
  @Test
  @Disabled
  public void testMethodTwo(){
	System.out.println("...Test method two");
  }
  
  @Test
  @RepeatedTest(5)
  public void testMethodThree(){
	System.out.println("...Test method three");
  }
  
  @AfterEach
  public void closeSetup(){
	System.out.println("running after every test");
  }
  
  @AfterAll
  public static void closeSetupAll(){
	System.out.println("Running After all test ran..");
  
  }
  
  
}
