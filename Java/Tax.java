//Wprogram6
import java.io.*;
class Tax
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter The CTC : ");	double ctc = Double.parseDouble(in.readLine());
		
		if(ctc<=0)
			System.out.print("Invalid Input");
		else if(ctc<=180000)
			System.out.println("Tax amount = Re. 0");
		else if(ctc>=180001 && ctc<=300000)
			System.out.println("Tax amount = Rs. "+(ctc*10/100));
		else if(ctc>=300001 && ctc<=500000)
			System.out.println("Tax amount = Rs. "+(ctc*20/100));
		else if(ctc>=500001 && ctc<=1000000)
			System.out.println("Tax amount = Rs. "+(ctc*30/100));
	}
}