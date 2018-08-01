package com.abinc.bank;

import java.io.Serializable;

public class SavingAccount implements Serializable, Comparable<SavingAccount> {

	//instance members
	private double accBal;
	private String accId;
	private String accHolderName;
	private boolean isSalAcc;
	
	//paramterized constructor
	public SavingAccount(double accBal, String accHolderName, String accId, boolean isSalAcc) {
		super();
		this.accBal = accBal;
		this.accId = accId;
		this.accHolderName = accHolderName;
		this.isSalAcc = isSalAcc;
	}

	
	//setter and getter methods
	public double getAccBal() {
		return accBal;
	}
	
	public void setAccBal(double accBal) {
		this.accBal = accBal;
	}
	
	public String getAccId() {
		return accId;
	}
	
	public void setAccId(String accId) {
		this.accId = accId;
	}
	
	public String getAccHolderName() {
		return accHolderName;
	}
	
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	
	public boolean isSalAcc() {
		return isSalAcc;
	}
	
	public void setSalAcc(boolean isSalAcc) {
		this.isSalAcc = isSalAcc;
	}
	
	//method to implement deposit functionality
	public double deposit(double amount)
	{
		accBal += amount;
		
		return accBal;
	}
	
	//method to implement deposit functionality
	public double withdraw(double amount)
	{
		if(amount>accBal)
			return -1;
		else
			accBal -= amount;

		return accBal;
	}

	//method to implement the Sorting of the accounts
	@Override
	public int compareTo(SavingAccount sa)
	{
		return this.accId.compareTo(sa.accId);
	}

	//display the details
	@Override
	public String toString() {
		return "SavingAccount [accBal=" + accBal + ", accId=" + accId + ", accHolderName=" + accHolderName
				+ ", isSalAcc=" + isSalAcc + "]";
	}	
	
}
