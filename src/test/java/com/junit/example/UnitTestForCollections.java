package com.junit.example;

import com.junitClass.example.ForCollections;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import java.util.ArrayList;
import java.util.Arrays;

import static com.junitClass.example.ForCollections.getCollections;

public class UnitTestForCollections {
  
  ForCollections collections = null;
  
  @Before
  public void init() {
	collections = new ForCollections();
  }
  
  @Test
  public void testCollections(){
  
	ArrayList<String> strings = new ArrayList<>(Arrays.asList("One","Two","Three"));
	ArrayList<String> stringsOne = new ArrayList<>(Arrays.asList("One","Two","Three"));
	System.out.println(strings);
	System.out.println(stringsOne);
	
	
	Assertions.assertIterableEquals(getCollections(strings),stringsOne);
  
  
  
  
  
  
  }
}
