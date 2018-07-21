//Tprogram2
import java.io.*;
class ReverseWord
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter The Sentence :: ");	String str = in.readLine();
		str=str+" ";
		int l=str.length();
		char ch;
		String wrd="";
		for(int i=0;i<l;i++)
		{
			ch=str.charAt(i);
			if(ch==' ')
			{
				System.out.print(wrd+" ");
				wrd="";
			}
			else
			{
				wrd=ch+wrd;
			}
		}
	}
}