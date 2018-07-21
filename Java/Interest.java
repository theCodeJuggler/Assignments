//WProgram4
import java.io.*;
class Interest
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter The Principal, Rate, Time respectively :: ");
		double p = Double.parseDouble(in.readLine());
		int t = Integer.parseInt(in.readLine());
		double r =  Double.parseDouble(in.readLine());
		
		double si = p*r*t/100;
		double ci = (Math.pow(p*(1+r/100),t))-p;
		
		System.out.println("Simple Interest = "+si);
		System.out.println("Compound Interest = "+ci);
	}
}