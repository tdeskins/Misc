package codeforces;

/** Input: one line, non-empty string s. This is a sum of numbers ranging from 1 to 3. String s is at most 100 characters long and contains only digits and '+'.
*
*Output: a sorted string of the summation.
*
*Example: 	input:	3+2+1+2
*		output:	1+2+2+3
*/


import java.util.*;
import java.io.*;
public class CF339A_HelpfulMaths
{
	static void printArray(int arr[])
	{
		int n = arr.length;
		for (int i = 0; i < n; ++i)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	void sort(int arr[])
	{
		int len = arr.length;
		for (int i=1; i<len; ++i)
		{
			int k = arr[i];
			int j = i-1;
			while (j>=0 && arr[j] > k)
			{
				arr[j+1] = arr[j];
				j = j - 1;
			}
			arr[j+1] = k;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
//		System.out.println("Input: one line, non-empty string s. This is a sum of numbers ranging from 1 to 3. String s is at most 100 characters long and contains only digits and '+'");
//		System.out.print("Input:	");
		String input = sc.nextLine();
		
		// Read in the string and split into a character array list
		int len = input.length();
		ArrayList<Character> arrli = new ArrayList<Character>(len);
		ArrayList<Integer> arrInd = new ArrayList<Integer>((len+1)/2);
		for (int i=0; i<len; i++)
		{
			arrli.add(input.charAt(i));
			if (i%2==0)
			{
				arrInd.add(Character.getNumericValue(arrli.get(i)));
			}
		}
		
		// Sort integers from least to greatest
		CF339A_HelpfulMaths is = new CF339A_HelpfulMaths();
		
		int[] arr = new int[arrInd.size()];

		for(int i=0; i < arrInd.size(); i++)
		{
			arr[i] = arrInd.get(i);
		}
		is.sort(arr);
		ArrayList<Character> output = new ArrayList<Character>(len);
		int n = arr.length;
		for (int i=0; i<n; i++)
		{
			output.add((char)(arr[i]+'0'));
			if (i==n-1)
			{
				continue;
			}
			output.add('+');
		}
		Iterator<Character> it = output.iterator();
		StringBuilder sb = new StringBuilder();
		while(it.hasNext())
		{
			sb.append(it.next());
		}
		System.out.println(sb.toString());
	}
}
