//Implementing the framework into the real world bank 
public class MMBankFactory extends BankFactory {
	
	public SavingAcc getNewSavingAccount(String accNm, int accNo, float accBal, boolean isSalaried)
	{
		//Creating object
		MMSavingAcc mmSavingAcc = new MMSavingAcc(accNm, accNo, accBal, isSalaried);
		// Saving Account from MM Bank factory to get new savings account
		return mmSavingAcc;
	}
	
	public CurrentAcc getNewCurrentAccount(String accNm, int accNo, float accBal, float creditLimit)
	{
		//Creating object
		MMCurrentAcc mmCurrentAcc = new MMCurrentAcc(accNm, accNo, accBal, creditLimit);
		// Saving Account from MM Bank factory to get new Current account
		return mmCurrentAcc;
	}
	
}