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
		double marksA = Double.parseDouble(in.readLine());
		double marksB = Double.parseDouble(in.readLine());
		double marksC = Double.parseDouble(in.readLine());
		
		double sum = marksA+marksB+marksC;
		
		//declaring the after checking the respective conditions
		if(marksA>60 && marksB>60 && marksC>60)
			System.out.println("Passed");
		if((marksA>60 && marksB>60) || (marksB>60 && marksC>60) || (marksA>60 && marksC>60))
			System.out.println("Promoted");
		if((marksA<60 && marksB<60) || (marksB<60 && marksC<60) || (marksA<60 && marksC<60) ||(marksA<60 && marksB<60 && marksC<60))
			System.out.println("Failed");
	}
}
