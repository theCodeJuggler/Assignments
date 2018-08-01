package com.abinc.bank;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {

	public static void main(String[] args)
	{
		List<SavingAccount> savingAccListD = new ArrayList<>();
		
		//reading from the file
		try(FileInputStream fis = new FileInputStream("account.txt");
				ObjectInputStream ois = new ObjectInputStream(fis))
		{
			savingAccListD = (List)ois.readObject();	//reading from the file
			
			savingAccListD.stream().forEach(System.out::println);	//writing to the console from file 
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
