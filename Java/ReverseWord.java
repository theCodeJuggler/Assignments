//Tprogram2
//reversing the words in the sentence preserving the whitespace
import java.io.*;
class ReverseWord
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		//Accepting the sentence from the user
		System.out.print("Enter The Sentence :: ");	String str = in.readLine();
		
		str=str+" ";	//Adding the trailing space for extrcting the word
		int l=str.length();
		
		char ch;
		String wrd="";
		
		for(int i=0;i<l;i++)
		{
			ch=str.charAt(i);		//extracting each character from the sentence
			if(ch==' ')			//if the extracted character is space then the word newly formed is printed
			{
				System.out.print(wrd+" ");
				wrd="";
			}
			else				//else the characters is accumulated in the string variable
			{
				wrd=ch+wrd;
			}
		}
	}
}
