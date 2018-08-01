package com.abinc.bank;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

//creating the list and adding the elements by creating the objects and calling list's add() 
public class SavingTest {

	public static void main(String[] args) throws IOException
	{
		List<SavingAccount> savingAccList = new ArrayList<>();

		savingAccList.add(new SavingAccount(10000.00,"SSB0011","Ram",true));
		savingAccList.add(new SavingAccount(2000.00,"SB0011","Shyam",false));
		savingAccList.add(new SavingAccount(21000.00,"SSB0012","Jodhu",true));
		savingAccList.add(new SavingAccount(30000.00,"SB0012","Modhu",false));
		savingAccList.add(new SavingAccount(21000.00,"SSB0014","Gita",true));
		
		//display the output
		System.out.println("The Savings Accounts Are :: ");
		savingAccList.stream().forEach((SavingAccount) -> System.out.println(SavingAccount));
		
		//code block to write arraylist to the file account.txt
		try(FileOutputStream fos = new FileOutputStream("account.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos))
		{
			savingAccList.stream().forEach((SavingAccount) -> {
				try {
					oos.writeObject(savingAccList);
				} catch (IOException e) {
					e.printStackTrace();
				}
			});
			
			System.out.println("Successful Serialized");	//message of successful write file  
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

}
