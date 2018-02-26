import java.io.*;
import java.util.*;

public class CF118_StringTask
{
	public static void main(String[] args)
	{
		/* given a string
		1) Delete all the vowels
		2) Insert a "." before each consonant
		3) Replace all uppercase consonants with corresponding lowercase ones
		*/

		Scanner sc = new Scanner(System.in);
		System.out.println("Input a string containing lowercase and uppercase letters");
		String input = sc.nextLine();
		input = input.toLowerCase();

		int len = input.length();
		ArrayList<Character> arrli = new ArrayList<Character>(len);

		for (int i = 0; i < len; i++)
		{
			if ((input.charAt(i)=='a') || (input.charAt(i)=='e') || (input.charAt(i)=='i') || (input.charAt(i)=='o') || (input.charAt(i)=='u') || (input.charAt(i)=='y'))
			{
				continue;
			}
			arrli.add('.');
			arrli.add(input.charAt(i));
		}
		Iterator<Character> it = arrli.iterator();
		StringBuilder sb = new StringBuilder();
		
		while(it.hasNext())
		{
			sb.append(it.next());
		}
		System.out.println("Output is: " + sb.toString());
	}
}
