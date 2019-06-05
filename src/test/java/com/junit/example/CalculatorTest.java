package com.junit.example;

import com.junitClass.example.Calculator;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static com.log.example.LogUtil.logger;


public class CalculatorTest {
  public static Calculator calculator = new Calculator();
  
  
  @Test
  @DisplayName("Add operation from calculator class")
  @RepeatedTest(5)
  public void addSomeNumber() {
	
	Assertions.assertEquals(2, calculator.add(1, 1));
	logger.info("Test method add is pass!!");
  }
  
  @BeforeAll
  public static void init() {
	logger.info("Before All init() method ..");
  }
  
  
}
