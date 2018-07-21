//Word program1
import java.io.*;
class Multiply
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter The Number :: ");
		int n = Integer.parseInt(in.readLine());
		int result = mul(n);
		System.out.println(n+" * 1 = "+(n*1)+", Square: "+result);
	}
	
	static int mul(int n)
	{
		return (n*n);
	}
}