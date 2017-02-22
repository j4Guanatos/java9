package com.quick.client;

import com.quick.QuickApp;

public class QuickClient {

  public static void main(String... args) {
    
	QuickApp app = new QuickApp();
	int result = app.add(2,1);
    System.out.println("the result is "+ result);
  }

}