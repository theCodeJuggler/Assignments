//implementing the Saving Bank account for Money Money Bank
public class MMSavingAcc extends SavingAcc {
	
	//parameterized constructor
	public MMSavingAcc(String accNm, int accNo, float accBal, boolean isSalary)
	{
		super(accNm, accNo, accBal, isSalary);

	}
	
	//implementing the withdraw for this implementation of the savings account
	@Override
	public void withdraw(float amount) {
		if (amount > getAccBal()) // if Above limit for saving acc then show error message
		{
			System.out.println("Error cannot withraw below limit.....");
		} else {
			setAccBal(getAccBal() - amount);
		}
	}
	
	//to display the outputs
	@Override
	public String toString() {
		return "MMSavingAcc [isSalary()=" + isSalary() + ", getAccNm()=" + getAccNm() + ", getAccNo()=" + getAccNo()
		+ ", getAccBal()=" + getAccBal() + "]";
	}
}