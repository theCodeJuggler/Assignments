package com.abcinc.operations;

import java.util.ArrayList;
import java.util.List;

public class OperationTest {
	
	public static void main(String args[])
	{
		List<Integer> list = new ArrayList<>();	//declaring the arraylist
		
		//adding numbers to the list
		for(int i=1;i<20;i++)
			list.add(i);
		
		System.out.println("Odd Numbers :: ");
		list.stream().filter(Lambdas.isOdd()).forEach(System.out::println);	//calling isOdd()
		
		System.out.println("Prime Numbers :: ");
		list.stream().filter(Lambdas.isPrime()).forEach(System.out::println);	//calling isPrime()
		
		System.out.println("Palindrome Numbers :: ");
		list.stream().filter(Lambdas.isPalindrome()).forEach(System.out::println);	//calling isPalindrome()
	}

}
