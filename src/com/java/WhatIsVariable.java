package com.java;

//Variables are containers for storing data values.To create a variable, you must specify the type and assign it a value: 
//type variableName = value;
//Variable: Vary as needed, a placeholder in memory. It has name and reserved value in memory.

public class WhatIsVariable {
	int studentID;   // Instance Variable:
	static String collegeName= "NC State University"; //Static variable 

	public static void main(String[] args) {
		String f_name = "John";
		System.out.println(f_name);
		
		int myNumber = 15;
		System.out.println(myNumber);
		
		int myNum;
		myNum = 985;
		System.out.println(myNum);
		
		int myNumbers = 5215;
		myNumbers = 200;  // myNum is now 200
		System.out.println(myNumbers);
		
		final int myScore = 95;
	//	int myScore = 85;  // can not be override , because you declared final
		System.out.println(myScore);
		
	/*	float myFloatNum = 5.99f;
		char myLetter = 'D';
		boolean myBool = true;  */
		
		WhatIsVariable whatIsVariable=new WhatIsVariable(); 
		// non Static to static, have no direct access.
		//To Access you have to create Class level variable
		
		whatIsVariable.studentYaamin();  // Need to call method in Main method to Execute
		whatIsVariable.studentShahid();

	}
	public void studentYaamin() {
		String firstName= "Sheikh";  //Local variable:
		studentID=1;
		System.out.println(studentID + " "+ firstName + "  "+collegeName ); // Static to non static  "collegeName"  direct access
		
	}
   public void studentShahid() {
	   String firstName= "Mohammed";  //Local variable:
		studentID=7;
		System.out.println(studentID + " "+ firstName + "  "+collegeName ); // Static to non static  "collegeName"  direct access
   }
}
