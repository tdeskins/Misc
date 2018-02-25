import java.io.*;
import java.util.*;

public class e1
{
	public static void main(String[] args)
	{
		// size of ArrayList
		int n = 1;

		// end value of search
		System.out.println("Sum of all the multiples of 3 or 5 below an end value. Please specificy the end value.");
		Scanner sc = new Scanner(System.in);
		int end = sc.nextInt();

		// declaring ArrayList with initial size n
		ArrayList<Integer> arrli = new ArrayList<Integer>(n);

		// Appending the new element to the end of the list
		for (int x=1; x< end; x++)
		{
			if (x%3==0 || x%5==0)
			{
				System.out.println(x + " is in the list");
				arrli.add(x);
			}
		}
		System.out.println(arrli);
		for (int i=1; i<arrli.size(); i++)
		{
			arrli.set(0, arrli.get(0)+arrli.get(i));
		}
		System.out.println("The sum of all multiples of 3 or 5 below " + end + " is " + arrli.get(0));
		System.out.println("The size of arrli is: " + arrli.size());
	}
}
