//10 input palindrome
//taking 10 words as input, finding which one is palindrome, its length and sorting in descending order of char
import java.io.*;
import java.util.Arrays;
class WordSet
{
	public static void main(String args[])throws IOException
	{
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		String words[] = new String[10];
		String copy;
		int l;
		
		//Accepting the word from the user
		System.out.println("Enter The Words ::");
		for(int i=0;i<10;i++)
			words[i]=in.readLine();
		
		for(int i=0;i<10;i++)
		{
			if(isPalin(words[i])) //calling isPalin() to check for palindrome
			{
				System.out.println("Number of Characters in "+words[i]+" is "+words[i].length());
				System.out.println("Sorted String is :: "+sort(words[i]));
			}
		}
	}
	
	//function to check for palindrome
	static boolean isPalin(String word)
	{
		String rev = "";
		
		//reversing the word
		for(int i=0;i<word.length();i++)
			rev = word.charAt(i)+rev;
		
		//checking if the reversed word is same as actual word
		if(rev.equals(word))
			return true;
		else
			return false;
	}
	
	//function to sort the characters
	static String sort(String word)
	{
		char w2c[] = word.toCharArray();
		Arrays.sort(w2c);
		String wrd = new String(w2c);
		String sortdWrd = "";
		
		for(int i=0;i<wrd.length();i++)
			sortdWrd = wrd.charAt(i)+sortdWrd;
		
		return sortdWrd;
	}
}