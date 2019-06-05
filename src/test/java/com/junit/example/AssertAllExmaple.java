package com.junit.example;

import com.junitClass.example.Student;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

public class AssertAllExmaple {
  
  
  @Test
  @DisplayName("Group AssertAll")
  public void groupedAssetions() {
	
	Student studentOne = new Student("TestUserOne", "TestUserLastName");
	
	assertAll("Student",
			() -> assertEquals("TestUserOne", studentOne.getFirstName()),
			() -> assertEquals("TestUserLastName", studentOne.getLastName())
	);
  }
  
  @Test
  public void dependentAssertions() {
	
	// Within a code block, if an assertion fails the
	//	// subsequent code in the same block will be skipped.
	
	Student student = new Student("Mike", "Miller");
	
	assertAll("Properties",
			
			() -> {
			  String firstName = student.getFirstName();
			  Assertions.assertNotNull(firstName);
			  
			  //Execute only if previous assertion is valid
			  
			  assertAll("First Name",
					  () -> Assertions.assertTrue(firstName.equalsIgnoreCase("mike"))
			  );
			  
			}
	);
	
	
  }
  
  
}
