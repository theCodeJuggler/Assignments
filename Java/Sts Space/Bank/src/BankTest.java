//Driver Program to test the Bank Operation Implementation
class BankTest {
	
	public static void main(String[] args) {
		
		//creating the objects
		MMBankFactory ram = new MMBankFactory();
		MMBankFactory shyam = new MMBankFactory();
		
		SavingAcc ramSavings = ram.getNewSavingAccount("Alfaiz", 15200, 54000, true);//initialization of saving account
		System.out.println("After Initialization");
		System.out.println(ramSavings);
		System.out.println("");
		
		CurrentAcc shyamCurrent = shyam.getNewCurrentAccount("saif", 15420, 54796, 10000);//initialization of Current account
		System.out.println("After Initialization");
		System.out.println(shyamCurrent);
		System.out.println("");
		
		ramSavings.withdraw(42000);
		System.out.println("After Withdrawal from savings"); 	//Withdrawal
		System.out.println(ramSavings);
		System.out.println("");
		
		ramSavings.deposit(14520);
		System.out.println("After Deposit in Savings");			//Deposit in saving account
		System.out.println(ramSavings);
		System.out.println("");
		
		shyamCurrent.withdraw(15640);
		System.out.println("After Withdrawal from Current");	//Withdrawal
		System.out.println(shyamCurrent);
		System.out.println("");
		
		shyamCurrent.withdraw(15640);
		System.out.println("After Deposit in Current");			//Deposit in current account
		System.out.println(shyamCurrent);
		System.out.println("");
	}
	
}