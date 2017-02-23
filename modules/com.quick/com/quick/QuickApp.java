package com.quick;
import com.quick.Operations;
import com.quick.impl.OperationsImpl;

public class QuickApp implements OperationsImpl {
	
   public int add(int a, int b) {
     return a  + b;
   } 
   
   
   public Operations getOperations() {
	   return new OperationsImpl();
   }

}
