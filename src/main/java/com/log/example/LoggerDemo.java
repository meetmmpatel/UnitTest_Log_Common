package com.log.example;

import static com.log.example.LogUtil.logger;

public class LoggerDemo {
  
  
  public static void main(String[] args) {
  
    logger.info("this is LoggerDemo Class");
	System.out.println("Print something ");
  
	System.out.println(logger.hashCode());
	
  }
}
