package codeforces;

import java.util.Scanner;

/**
 * input: a b n lengthen "a" n times lengthen means that a digit [0-9] must be
 * added to the right side of "a" and that resulting number be visible by b
 * ----------------- input a b n output -----------------------
 * ----------------- input 5 4 5 output 524848 ----------------
 */
// --###Problematic when asking to compute 1E(1E5)###----------
public class CF260A_AddingDigits {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a, b, n;
		a = in.nextInt();
		b = in.nextInt();
		n = in.nextInt();
		int temp;
		for (int i = 0; i <= 9; i++) { // test all digits
			temp = Integer.parseInt(a + "" + i);
			if (temp % b == 0) {
				n--;
				System.out.print(temp);
				for (int j = 1; j <= n; j++)
					System.out.print(0);
				return;
			}
		}
		System.out.println(-1);
	}
}
