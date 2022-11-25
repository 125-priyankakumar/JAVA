package com.org.tyson;

public class AxisBank extends Bank{

	@Override
	void saving() {
		// TODO Auto-generated method stub
	System.out.println("Saving Regular");
	}

	@Override
	void current() {
		// TODO Auto-generated method stub
		System.out.println("Current Account");
	}

	@Override
	void salary() {
		System.out.println("Month Salary");
		
	}

	@Override
	void joint() {
		// TODO Auto-generated method stub
		System.out.println("Joint Account");
		
	}
   public static void main(String[] args) {
	AxisBank info = new AxisBank();
	info.branchDetails();
	info.salary();
	info.saving();
}
		
}
