import java.io.*;
//program to remove duplicate characters from the inputted strings
class RemoveDuplicateChar
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//Accept the input from the user
		System.out.println("Enter The String :: ");
		String word = in.readLine();
		
		char charArr[] = word.toCharArray();
		
		int i, j , k=0, flag;
		
		char ar[] = new char[30];
		
		//accessing the characters and checking the duplicates
		for(i=0;i<charArr.length;i++)
		{
			flag = 0;
			for(j=0;j<ar.length;j++)
			{
				if(charArr[i] == ar[j])
				{
					flag++;
					break;
				}
			}
			
			if(flag==0)
				ar[k++]=charArr[i];
		}
		
		System.out.println("The Resultant Word :: ");
		
		//displaying the rsultant string after removing the duplicates
		for(i=0;i<ar.length;i++)
			System.out.print(ar[i]);
		
	}
}