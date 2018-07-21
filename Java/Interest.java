//WProgram4
//Calculating the simple and compound interest
import java.io.*;
class Interest
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//Accepting the user inputs
		System.out.print("Enter The Principal, Rate, Time respectively :: ");
		double p = Double.parseDouble(in.readLine());
		int t = Integer.parseInt(in.readLine());
		double r =  Double.parseDouble(in.readLine());
		
		double si = p*r*t/100;	//calculating the simple interest
		double ci = (Math.pow(p*(1+r/100),t))-p;	//calculating the compound interest
		
		System.out.println("Simple Interest = "+si);	//displaying the simple interest
		System.out.println("Compound Interest = "+ci);	//displaying the compound interest
	}
}
