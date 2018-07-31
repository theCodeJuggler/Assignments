package com.abinc.bank;

import java.util.ArrayList;
import java.util.List;

//creating the list and adding the elements by creating the objects and calling list's add() 
public class SavingTest {

	public static void main(String[] args) 
	{
		List<SavingAccount> savingAccList = new ArrayList<>();

		savingAccList.add(new SavingAccount(10000.00,"SSB0011","Ram",true));
		savingAccList.add(new SavingAccount(2000.00,"SB0011","Shyam",false));
		savingAccList.add(new SavingAccount(21000.00,"SSB0012","Jodhu",true));
		savingAccList.add(new SavingAccount(30000.00,"SB0012","Modhu",false));
		savingAccList.add(new SavingAccount(21000.00,"SSB0014","Gita",true));
		
		//display the output
		System.out.println("The Savings Accounts Are :: ");
		savingAccList.stream().forEach((SavingAccount) -> System.out.println(SavingAccount));
	}

}
