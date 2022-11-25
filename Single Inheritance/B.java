package com.org.tyson;

public class B extends A{
	public void methodB()
	{
		System.out.println("child class method");	
		}
	public static void main(String[] args) {
		B obj = new B();
		obj.methodA();
		obj.methodB();
	}

}
