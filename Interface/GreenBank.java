package com.org.tyson;

public class GreenBank implements HDFC,RBI{

	@Override
	public void savings() {
		// TODO Auto-generated method stub
		System.out.println("5%");
		
	}

	@Override
	public void fixed() {
		// TODO Auto-generated method stub
		System.out.println("10%");
	}

	@Override
	public void deposite() {
		// TODO Auto-generated method stub
		System.out.println("15%");
	}
	public static void main(String[] args) {
		GreenBank Bank = new GreenBank();
		Bank.savings();
		Bank.deposite();
		Bank.fixed();
		Bank.Currentt();
	}

	@Override
	public void Currentt() {
		// TODO Auto-generated method stub
		System.out.println("60%");
	}
}
