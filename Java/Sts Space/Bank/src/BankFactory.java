//Framework for the bank implementation
public abstract class BankFactory {
	
	//abstract methods for different implementations later
	public abstract SavingAcc getNewSavingAccount(String accNm, int accNo, float accBal, boolean isSalaried);
	public abstract CurrentAcc getNewCurrentAccount(String accNm, int accNo, float accBal, float creditLimit);

}