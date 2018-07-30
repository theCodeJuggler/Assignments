package in.co.abinc.app;

public class MMASavingAccount {

	//instance members
	private String accountID;
	private String accountHolderName;
	private String accountBalance;
	private boolean isSalaryAccount;
	
	//setter getter methods
	public String getAccountID() {
		return accountID;
	}
	
	public void setAccountID(String accountID) {
		this.accountID = accountID;
	}
	
	public String getAccountHolderName() {
		return accountHolderName;
	}
	
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	
	public String getAccountBalance() {
		return accountBalance;
	}
	
	public void setAccountBalance(String accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}
	
	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}
	
}
