//Framework for current account
public abstract class CurrentAcc extends BankAcc {
	
	//instance members
	private final float CreditLimit;
	
	//implementing the current account
	public CurrentAcc(String accNm, int accNo, float accBal, float creditLimit) 
	{
		super(accNm, accNo, accBal);
		CreditLimit = creditLimit;
	}
	
	//retrieve the credit limit
	protected float getCreditLimit() 
	{
		return CreditLimit;
	}
	
	//to implement the withdraw
	@Override
	public void withdraw(float amount)
	{
		if (amount > getAccBal() + CreditLimit) // if Above limit for Current then show error message
		{
			System.out.println("Error Cannot withdraw Above Limit...");
		}
		else
			setAccBal(getAccBal() - amount);
	}
	
	//to display the outputs
	@Override
	public String toString()
	{
		return "CurrentAcc [CreditLimit=" + CreditLimit + ", getAccNm()=" + getAccNm() + ", getAccNo()=" + getAccNo()
		+ ", getAccBal()=" + getAccBal() + "]";
	}
	
}