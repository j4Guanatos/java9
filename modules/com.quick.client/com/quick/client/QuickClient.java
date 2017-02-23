package com.quick.client;

import com.quick.QuickApp;
import com.quick.Operations;

public class QuickClient {

  public static void main(String... args) {
    
	QuickApp app = new QuickApp();
	int result = app.add(2,1);
	Operations oper = app.getOperations();
	int substractResult = oper.substract(3,1);
	System.out.println("the result of the substract is " + substractResult);
    System.out.println("the result of the sum is "+ result);
  }

}