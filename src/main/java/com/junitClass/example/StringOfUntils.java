package com.junitClass.example;

public class StringOfUntils {
  
  public static Double convertToDouble(String str) {
	
	if (str.equals(null)) {
	  return null;
	}
	
	return Double.valueOf(str);
	
  }
  
 
}
