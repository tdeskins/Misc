package projecteuler;

import java.io.*;
import java.util.*;

public class e1improved
{
	// Use Euclid's algorithm to find gcd
	public static int gcd(int p, int q)
	{
		if (q ==0) return p;
		else return gcd(q, p % q);
	}
	public static void main(String[] args)
	{
		System.out.println("Sum of multiples of i and j up to, but not including, end value");
		System.out.println("Please input i, j, and end");

		// define scanner object
		Scanner sc = new Scanner(System.in);
		
		//define i, j, and end
		System.out.print("i: ");
		int i = sc.nextInt();
		System.out.print("j: ");
		int j = sc.nextInt();
		System.out.print("end: ");
		int end = sc.nextInt();

		// Define Largest Multiple of i and j less than end
		double iLM = Math.floor(end/i)*i;
		if(iLM==end)
		{
			iLM = end - i;
		}
		double jLM = Math.floor(end/j)*j;
		if(jLM==end)
		{
			jLM = end - j;
		}
		
		// Euclid's algorithm is used, product/gcd is the least common multiple
		int d = gcd(i,j);
		// ij is the LCM of i and j
		int ij = (i*j)/d;
		
		// Find the Largest Multiple of the LCM of i and j less than end
		double ijGCF = Math.floor(end/(ij))*ij;
		if(ijGCF==end)
		{
			ijGCF = end - ij;
		}
		System.out.println("Largest Common Multiple of i and j: " + ij);
		System.out.println("Largest Multiple of i < end: " + (int) iLM);
		System.out.println("Largest Mutliple of j < end: " + (int) jLM);
		System.out.println("Largest Multiple of LCM i,j < end: " + (int) ijGCF);

		double it = (0.5/i)*(i+iLM)*(iLM);
		double jt = (0.5/j)*(j+jLM)*(jLM);
		double ijt = (0.5/(ij))*((ij)+ijGCF)*(ijGCF);
		double sum = it + jt - ijt;
		int intsum = (int) sum;
		System.out.println("Sum is " + intsum);
	}
}
		
