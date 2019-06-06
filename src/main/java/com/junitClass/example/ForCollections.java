package com.junitClass.example;

import java.util.ArrayList;
import java.util.List;

public class ForCollections {
  
  
  public static List<String> getCollections(List<String> strList){
  
	ArrayList list = new ArrayList();
	list.add("TestOne");
	list.add("TestTwo");
	list.add("TestThree");
	
	
	strList.addAll(list);
	return strList;
  
  
  }
  
  
  public static void main(String[] args) {
	ArrayList list = new ArrayList();
	list.add("TestOne");
	list.add("TestTwo");
	list.add("TestThree");
 
	getCollections(list);
	System.out.println(getCollections(list));
  }
}
