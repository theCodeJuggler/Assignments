//WProgram8
import java.io.*;
class Application
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String uid="abbiswas", pwd="12345";
		int i=1;
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
		
		if(i==4)
			System.out.println("Contact Admin");
	}
}