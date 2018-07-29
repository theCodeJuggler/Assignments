package com.abcinc.app;

public class CheckDemo {
	
	public static void main(String args[])
	{
		Check check = new Check();
		
		check.disp();
		System.out.println("Public Variable :: "+check.pblcVar);
		System.out.println("Protected Variable :: "+check.prtctVar);
		System.out.println("Default Variable :: "+check.dfltVar);
		
		//System.out.println("Private Variable :: "+check.pvtVar); private variable cannot accessed directly
		System.out.println("Private Variable :: "+check.getPvtVar()); //getting the private variable through getter function
	}
}
