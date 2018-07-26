//Framework for Savings Bank Account
public abstract class SavingAcc extends BankAcc {
	
	private boolean isSalary;	//instance members
	private final static float MINBAL = 2000;	//class members
	
	//parameterized constructor to initialize the instance members
	public SavingAcc(String accNm, int accNo, float accBal, boolean isSalary) {
		super(accNm, accNo, accBal);
		this.isSalary = isSalary;
	}
	
	//returning the salary to the user
	public boolean isSalary() {
		return isSalary;
	}
	
	//returning the minimum balance amount
	public static float getMinbal() {
		return MINBAL;
	}
	
	//implementing the withdraw()
	@Override
	public void withdraw(float amount) {
		
		if (amount > getAccBal()) 
			System.out.println("Error cannot withraw below limit.....");
		else
			setAccBal(getAccBal() - amount);
		
	}
	
	//displaying the outputs
	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", isSalary()=" + isSalary() + "]";
	}
}