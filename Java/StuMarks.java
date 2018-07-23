//Wprogram11
//Accepting 3 students' marks in 3 subjects and finding out sum and average
import java.io.*;
class StuMarks
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int marks[][]=new int[5][5];
		
		//accepting the marks of the 3 students in the subjects
		for(int i=0;i<3;i++)
		{
			System.out.println("Student "+(i+1));
			
			for(int j=0;j<3;j++)
			{
				marks[i][j]=Integer.parseInt(in.readLine());
			}
		}
		
		//calculating total and average marks of each student
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				marks[i][3]+=marks[i][j];
			}
			marks[i][4]=marks[i][3]/3;
		}
		
		// calculating total and average marks of each subject
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				marks[3][i]+=marks[j][i];
			}
			marks[4][i]=marks[3][i]/3;
		}
		
		//displaying the desired ouput
		System.out.println("Subject Marks:");
		for(int i=0;i<3;i++)
			System.out.println("Subject "+(i+1)+": Total Marks = "+marks[3][i]+" , Average Marks = "+marks[4][i]);
		
		System.out.println("Student Marks:");
		for(int i=0;i<3;i++)
			System.out.println("Student "+(i+1)+": Total Marks = "+marks[i][3]+" , Average Marks = "+marks[i][4]);
	}
}
