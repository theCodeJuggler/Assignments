import java.io.*;
class RemoveDuplicateChar
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter The String :: ");
		String word = in.readLine();
		
		char charArr[] = word.toCharArray();
		
		int i, j , k=0, flag;
		
		char ar[] = new char[30];
		
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
		
		for(i=0;i<ar.length;i++)
			System.out.print(ar[i]);
		
	}
}