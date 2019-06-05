package com.junit.example;


import com.junitClass.example.Calculator;
import com.junitClass.example.StringOfUntils;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class JunitAssertionClass {
  
  
  @Test
  public void testAssertEquals() {
	Calculator calculator = new Calculator();
	
	//AssertEquals
	//AssertNotEquals
	Assertions.assertEquals(4, calculator.add(2, 2));
	Assertions.assertNotEquals(5, calculator.add(2, 2));
  }
  
  
  @Test
  public void testAssertAll() {
	String age = "68";
	Double xage = Double.valueOf(age);
	Double actualAge = StringOfUntils.convertToDouble(age);
	
	Assertions.assertAll("Do all Assertions ",
			
			
			new org.junit.jupiter.api.function.Executable[]{() -> {
			  Assertions.assertNotEquals(actualAge,50);
			  Assertions.assertEquals(xage, actualAge);
			}});
	
	
  }
  
  
}
