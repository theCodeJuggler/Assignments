//WProgram7
import java.io.*;
class WdAte
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("Enter The Date : ");	String dt = in.readLine();
		dt=dt+",";
		int l=dt.length();
		String st="";
		char ch;
		int cntr=0,m;
		for(int i=0;i<l;i++)
		{
			ch=dt.charAt(i);
			if(ch!=',')
			{
				st=st+ch;
			}
			else
			{
				cntr++;
				if(cntr==2)
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
				st="";
			}
		}
	}
}