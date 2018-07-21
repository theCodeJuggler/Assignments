//WProgram3
class ArmSeries
{
	public static void main(String args[])
	{
		boolean pt;
		for(int i=100; i<=999; i++)
		{
			pt=arms(i);
			if(pt==true)
				System.out.println(i);
		}
	}
	
	static boolean arms(int n)
	{
		int c=n, d, s=0;
		while(c>0)
		{
			d=c%10;
			s=s+d*d*d;
			c/=10;
		}
		if(n==s)
			return true;
		else
			return false;
	}
}