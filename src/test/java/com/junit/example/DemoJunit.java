package com.junit.example;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

import static com.log.example.LogUtil.logger;


public class DemoJunit {

  @BeforeAll
  public static void intiAll(){
    logger.info("@BeforeAll - run ...");
    System.out.println("this is before all");
  }

  @Before
  public static void testSome(){
  
  }



}
