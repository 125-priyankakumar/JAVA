package com.org.tyson;

public class kotak extends ICIC{
	public void fixed()
	  {
		  System.out.println("8%");
		  }
	  public void deposite() {
		System.out.println("7%");  
	  }

	  public static void main(String[] args)
	  {
	  kotak bank = new kotak();
	  bank.savings();
	  bank.deposite();
	  bank.fixed();

	}
}