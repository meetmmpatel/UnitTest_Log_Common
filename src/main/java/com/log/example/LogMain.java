package com.log.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.log.example.LogUtil.logger;

public class LogMain {
  
  
  public static void main(String[] args) {
	
	int numOne = 10;
	int numTwo = 0;
	
	int total = numOne + numTwo;
	logger.debug("This main method was run successfully");
	
	logger.info("This is when you want to simply inform action");
	
	logger.error("this is when error occurs !! ");
 
	System.out.println(logger.hashCode());
	
	try {
	  double num = numOne / numTwo;
	  logger.info("Value of num " + num);
	} catch (ArithmeticException e) {
	  logger.debug(e.getMessage());
	}
	
	
  }
}
