//WProgram7
//Input - 09,07,2010	Output - 09/July/2010
import java.io.*;
class WdAte
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//user input
		System.out.print("Enter The Date : ");	String dt = in.readLine();
		
		dt=dt+",";	//adding a trailing comma for the year part to be extracted
		
		int l=dt.length();
		String st="";
		char ch;
		int cntr=0,m;
		
		for(int i=0;i<l;i++)
		{
			ch=dt.charAt(i);	//extracting the characters frm string of date
			if(ch!=',')		//if comma is not encountered then the characters are accumulated in the string
			{
				st=st+ch;
			}
			else			//else the comma counter is incremented
			{
				cntr++;
				if(cntr==2)	//if comma counter is 2 the month is calculated in the word format and and displayed
				{
					m=Integer.parseInt(st);
					switch(m)
					{
						case 1:
							System.out.print("/January/");
							break;
						case 2:
							System.out.print("/February/");
							break;
						case 3:
							System.out.print("/March/");
							break;
						case 4:
							System.out.print("/April/");
							break;
						case 5:
							System.out.print("/May/");
							break;
						case 6:
							System.out.print("/June/");
							break;
						case 7:
							System.out.print("/July/");
							break;
						case 8:
							System.out.print("/August/");
							break;
						case 9:
							System.out.print("/September/");
							break;
						case 10:
							System.out.print("/October/");
							break;
						case 11:
							System.out.print("/November/");
							break;
						case 12:
							System.out.print("/December/");
							break;
					}
				}
				else
				{
					System.out.print(st);
				}
				st="";	//initializing the string variable
			}
		}
	}
}
