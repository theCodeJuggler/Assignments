package com.abcinc.app;

public class Check {

	int dfltVar=1;
	private int pvtVar = 2;
	public int pblcVar = 3;
	protected int prtctVar = 4;
	
	public void disp()
	{
		System.out.println("I am Disp()");
	}

	public int getPvtVar() {
		return pvtVar;
	}
	
	

}
