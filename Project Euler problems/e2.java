import java.io.*;
import java.util.*;
public class e2
{
	static int fib(int n)
	{
		int a = 1, b = 2, c;
		if (n==0)
		{
			return a;
		}
		for (int i=2; i<=n; i++)
		{
			c = a + b;
			a = b;
			b = c;
		}
		return b;
	}

	public static void main(String[] args)
	{
		
		// fib(n) returns the nth number in the fibonacci sequence below END
		Scanner sc = new Scanner(System.in);
		System.out.println("Specify END value");
		int END = sc.nextInt();
		int n=0;
		while (n++ < 40) 
		{
			if (fib(n)>END ) break;
		}
		n=n-1;
		System.out.println(n + " | " + fib(n));
		
		// sum of the even valued terms up to and including n
		ArrayList<Integer> arrli = new ArrayList<Integer>(1);
		for(int i = 0; i <= n; i++)
		{
			if (fib(i)%2==0)
			{
				arrli.add(fib(i));
			}
		}
		System.out.println(arrli);
		System.out.println("Sum of the even values of the fibonacci sequence up to " + END + " is: ");
		int sum=0;
		for(int i = 0; i < arrli.size(); i++)
		{
			sum += arrli.get(i);
		}
		System.out.println(sum);
	}
}
