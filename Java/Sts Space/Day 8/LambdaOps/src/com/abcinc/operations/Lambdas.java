package com.abcinc.operations;

import java.util.function.Predicate;

//class defining all the required lambda expressions
public class Lambdas {
	
	//odd checking lambda expression
	public static Predicate<Integer> isOdd()
	{
		Predicate<Integer> predicate = num ->
		{
			if(num%2 == 0)
				return false;
			else
				return true;
		};
		
		return predicate;
	}
	
	//prime no checking lambda expression
	public static Predicate<Integer> isPrime()
	{
		Predicate<Integer> predicate = num ->
		{
			for (int j = 2; j < num; j++)
			{
				if (num % j == 0)
						return false;
			}
			return true;
		};
		
		return predicate;
	}
	
	//palindrome no checking lambda expression
	public static Predicate<Integer> isPalindrome()
	{
		Predicate<Integer> predicate = num ->
		{
			int copy = num, sum = 0, digit, cnt = 0;

			while (num != 0)
			{
				digit = num % 10;
				sum = sum * 10 + digit;
				cnt++;
				num = num / 10;
			}

			if (copy == sum && cnt>1)
				return true;
			else
				return false;
		};
		
		return predicate;
		
	}
	
}
