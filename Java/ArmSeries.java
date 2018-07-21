//WProgram3
//finding the armstrong no. falling between 100 to 999
class ArmSeries
{
	public static void main(String args[])
	{
		boolean flag;
		//running loop 100 to 999 and sending each number to armstrong number checking function
		for(int i=100; i<=999; i++)
		{
			flag=armstrongCheck(i);
			if(pt==true)
				System.out.println(i); //if the number is armstrong then displaying it
		}
	}
	
	//function to check for armstrong number condition
	static boolean armstrongCheck(int n)
	{
		int c=n, d, s=0;
		while(c>0)
		{
			d=c%10;		//extracting the digits
			s=s+d*d*d;	//forming the new number
			c/=10;		//decrementing the loop variable
		}
		
		//checking the armstrong number condition
		if(n==s)
			return true;
		else
			return false;
	}
}
