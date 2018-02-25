import java.io.*;
import java.util.*;

public class e1improved
{
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

		// GCF
		double iGCF = Math.floor(end/i)*i;
		if(iGCF==end)
		{
			iGCF = end - i;
		}
		double jGCF = Math.floor(end/j)*j;
		if(jGCF==end)
		{
			jGCF = end - j;
		}
		double ijGCF = Math.floor(end/(i*j))*i*j;
		if(ijGCF==end)
		{
			ijGCF = end - i*j;
		}

		System.out.println("iGCF: " + (int) iGCF);
		System.out.println("jGCF: " + (int) jGCF);
		System.out.println("ijGCF: " + (int) ijGCF);

		double it = (0.5/i)*(i+iGCF)*(iGCF);
		double jt = (0.5/j)*(j+jGCF)*(jGCF);
		double ijt = (0.5/(i*j))*((i*j)+ijGCF)*(ijGCF);
		double sum = it + jt - ijt;
		int intsum = (int) sum;
		System.out.println("Sum is " + intsum);

	}
}
		
