//Add the numbers accepted through command line
public class Addition
{
	public static void main(String args[])
	{
		//storing sum in sum variable .. converting the argument into Integer format using
		//Integer.parseInt
		double sum=0.0;
		
		//running loop to retrieve every argument
		for(int i=0;i<args.length;i++)
			sum += Integer.parseInt(args[i]);
		
		//displaying the result
		System.out.println(sum);
	}
}
