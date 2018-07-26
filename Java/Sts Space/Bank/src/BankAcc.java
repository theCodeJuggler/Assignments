//Framework for bank account
public abstract class BankAcc {
	
	//instance members 
	private String accNm;
	private int accNo;
	private float accBal;
	
	//parameterized constructor to initialize the instance members
	public BankAcc(String accNm, int accNo, float accBal) {
		this.accNm = accNm;
		this.accNo = accNo;
		this.accBal = accBal;
	}
	
	protected String getAccNm() {
		return accNm;
	}
	
	protected void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	
	protected int getAccNo() {
		return accNo;
	}
	
	protected void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	
	protected float getAccBal() {
		return accBal;
	}
	
	protected void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	
	public void withdraw(float amount) {
		accBal -= amount;
	}
	
	public void deposit(float amount) {
		accBal += amount;
	}
	
	//to display the output details 
	@Override
	public String toString() {
		return "BankAcc [accNm=" + accNm + ", accNo=" + accNo + ", accBal=" + accBal + "]";
	}
}