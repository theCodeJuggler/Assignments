//WProgram8
//Program to simulate login into application using user id and password
import java.io.*;
class Application
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//Setting a predefined user id and password
		String uid="abbiswas", pwd="12345";
		int i=1;
		
		//using do-while loop to give continuous 3 chances to login in case of wrong id password inserted
		do
		{
			System.out.print("User ID :: "); String id=in.readLine();
			System.out.print("Password :: "); String pass=in.readLine();
			
			if(id.equals(uid) && pwd.equals(pass))
			{
				System.out.println("Welcome "+id);
				break;
			}
			i++;
		}
		while(i<=3);
		
		//displaying message if the 3 chances get exhausted
		if(i==4)
			System.out.println("Contact Admin");
	}
}
