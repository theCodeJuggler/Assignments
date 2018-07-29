package com.abcinc.exp;

//driver program to instantiate the child class and call the functions
public class Test {

	public static void main(String[] args) {

		Child child = new Child();
		
		child.display(4);	 //method of super class
		child.display(1, 2); //method of child class

	}

}
