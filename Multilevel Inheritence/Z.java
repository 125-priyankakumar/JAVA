package com.org.tyson;

public class Z extends Y{
   public void methodz()
   {
	   System.out.println("Class Z method");
   }
   public static void main(String[] args) {
   Z obj = new Z();
   obj.methodx(); // calling grand parent calls
   obj.methodY(); //calling parent calls
   obj.methodz(); //calling local method
}
}
