package com.abinc.wordcnt;

import java.io.*;

public class WordCount {

	public static void main(String[] args)throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter The File");
		String path = in.readLine();
		
		File file = new File(path);
		
		if(file.exists() && !file.isDirectory())
		{
			try
			{
				
				FileInputStream fln = new FileInputStream(file);
				InputStreamReader isr = new InputStreamReader(fln);
				BufferedReader br = new BufferedReader(isr);
				
				String line = br.readLine();
				int wrdCnt = 0;
				String wrdArr[];
				
				while(line != null)
				{
					wrdArr = line.split(" ");
					wrdCnt += wrdArr.length;
					line = br.readLine();
				}
				
				System.out.println("Word Count :: "+wrdCnt);
				
				br.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		else
		{
			System.out.println("File Does not Exist !!");
		}
		
	}

}
