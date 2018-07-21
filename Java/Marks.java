//WProgram5
//deciding the student academic status with reapect to the marks
import java.io.*;
class Marks
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//accepting the marks of all the subjects
		System.out.print("Enter The Marks of 3 Subjects :: ");
		double m1 = Double.parseDouble(in.readLine());
		double m2 = Double.parseDouble(in.readLine());
		double m3 = Double.parseDouble(in.readLine());
		
		double sum = m1+m2+m3;
		
		//declaring the after checking the respective conditions
		if(m1>60 && m2>60 && m3>60)
			System.out.println("Passed");
		if((m1>60 && m2>60) || (m2>60 && m3>60) || (m1>60 && m3>60))
			System.out.println("Promoted");
		if((m1<60 && m2<60) || (m2<60 && m3<60) || (m1<60 && m3<60) ||(m1<60 && m2<60 && m3<60))
			System.out.println("Failed");
	}
}
