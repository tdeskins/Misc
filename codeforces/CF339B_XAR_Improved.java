package codeforces;

import java.util.Scanner;

public class CF339B_XAR_Improved {
	public static CF339B_XAR_Improved ex;

	// starting location at Xenia's house, n =1
	// n number of houses, 2<=n<=1E5
	// m number of things to do, 1<=m<=1E5
	// house number a containing mth thing to do, 1<=a<=m
	/*-----------------------------------
	 * INPUT: n m a1 a2 .. am
	 -----------------------------------*/
	/*-----------------------------------
	 * OUTPUT: one integer: t (time it takes to complete all tasks)
	 -----------------------------------*/
	
	private CF339B_XAR_Improved() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		long t = 0;
		int start = 1;
		int a;
		for (int i = 0; i < m; i++) {
			a = sc.nextInt();
			if (a == start) {
				continue;
			}
			if (a > start) {
				t = t - start + a;
			} else {
				t = t - start + a + n;
			}
			start = a;
		}
		System.out.println(t);
	}

	public static void main(String[] args) {
		ex = new CF339B_XAR_Improved();
	}
}
