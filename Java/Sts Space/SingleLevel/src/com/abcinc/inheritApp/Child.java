package com.abcinc.inheritApp;

public class Child extends Parent {

	//non-arg constructor
	Child()
	{
		super();
		System.out.println("I Child Constructor !!");
	}
	
	//method to display
	void dispC()
	{
		System.out.println("I am Display of Child.");
	}
}
