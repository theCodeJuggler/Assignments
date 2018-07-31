package com.abinc.bank;

import java.util.Set;
import java.util.TreeSet;

public class BankAccounList {

	Set<SavingAccount> treeSet = new TreeSet<>();
	
	//function to add the saving account
	public void addSavingAccount(SavingAccount sa)
	{
		treeSet.add(sa);
		System.out.println("\nAfter Adding SavingAccount of " + sa.getAccHolderName());
		treeSet.stream().forEach((treeSetList) -> System.out.println(treeSetList));
	}
	
	//function to remove the saving account
	public void remSavingAccount(SavingAccount sa)
	{
		treeSet.remove(sa);
		System.out.println("\nAfter Removing SavingAccount of " + sa.getAccHolderName());
		treeSet.stream().forEach((treeSetList) -> System.out.println(treeSetList));
	}
}
