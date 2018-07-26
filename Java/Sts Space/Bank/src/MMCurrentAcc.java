//Implementation of current account for Money Money bank 
public class MMCurrentAcc extends CurrentAcc {
	
	//constructor to initialize the instance members
	public MMCurrentAcc(String accNm, int accNo, float accBal, float creditLimit) 
	{
		super(accNm, accNo, accBal, creditLimit);	//calling constructor of the parent class and initializing the members 
	}
	
	//implementing the withdraw operation
	public void withdraw(float amount) 
	{
		if (amount > getAccBal() + getCreditLimit()) // if Above limit for Current then show error message
			System.out.println("Error Cannot withdraw Above Limit...");
		else
			setAccBal(getAccBal() - amount);
	}
	
	//displaying the outputs
	@Override
	public String toString() {
		return "MMCurrentAcc [getAccNm()=" + getAccNm() + ", getAccNo()=" + getAccNo() + ", getAccBal()=" + getAccBal()
		+ "]";
	}
}