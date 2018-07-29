package com.abcinc.app;

//class to declare and initialize the required members and methods
public class Check {

	int dfltVar=1;
	private int pvtVar = 2;
	public int pblcVar = 3;
	protected int prtctVar = 4;
	
	public void disp()
	{
		System.out.println("I am Disp()");
	}

	//method to retrieve the private instance member 
	public int getPvtVar() {
		return pvtVar;
	}
	
}
