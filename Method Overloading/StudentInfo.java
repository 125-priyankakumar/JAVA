package com.org.tyson;

public class StudentInfo {
public void studentDetails(int num) {
	System.out.println("Student Details");
}
public void studentDetails(String name) { 
	// depends on order
	System.out.println("Student Name :"+name);
}
public void studentDetails(String email, int ph) { 
	//depends on data type
	System.out.println("Student email :"+email );
	System.out.println("Student Phone :"+ph );
}
public void studentDetails(int dob, String add) { 
	//depends on data type count
	System.out.println("Student Dob :"+dob);
	System.out.println("Student add :"+add );
}
public static void main(String[] arg) { 
StudentInfo info = new StudentInfo();
info.studentDetails(8);
info.studentDetails("01Priyanka");
info.studentDetails(22/02/2000, "Feb");
info.studentDetails("Priyanka.kumar@gmail.com", 994275);
}
}
