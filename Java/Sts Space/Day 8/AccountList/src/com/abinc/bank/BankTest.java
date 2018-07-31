package com.abinc.bank;

//driver program to call the functions
public class BankTest {

	public static void main(String[] args)
	{

		//creating saving account objects for the new users
		SavingAccount johnSa = new SavingAccount(20000,"John","SB2010",false);
		SavingAccount peterSa = new SavingAccount(50000,"Peter","SSB1010",true);
		
		//creating bank account list object to save the saving accounts in the list
		BankAccounList bankAccountList = new BankAccounList();
		
		//Adding Saving Method
		bankAccountList.addSavingAccount(peterSa);
		bankAccountList.addSavingAccount(johnSa);
		
		//Removing Saving Account
		bankAccountList.remSavingAccount(peterSa);

	}

}
