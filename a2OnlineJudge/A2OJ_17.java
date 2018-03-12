package a2OnlineJudge;

import java.util.Scanner;

public class A2OJ_17 {
	public static void main (String[] args) {
//		// assume inf children
//		// T = #test cases
//		// N = #different candies
//		// K = #min number of candies that satisfy a child
//		// a1 .. aN = #available types of candies of each type
//		// Calculate maximum number of satisfied children
//
//		/*
//		 * Sample Input: 2 3 2 4 5 7 3 8 4 5 7 Sample Output: 7 0
//		 */

		int T, N, K;
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		int[][] aArr = new int[1000][T];
		int[] bArr = new int[T];
		for (int i = 0; i < T; i++) {
			N = sc.nextInt();
			K = sc.nextInt();
			for (int a = 0; a < N; a++) {
				aArr[a][i] = sc.nextInt();
				if (aArr[a][i]>=K) {
					bArr[i]+=aArr[a][i]/K;
				}
			}
		}
		for (int i = 0; i < T; i++) {
			System.out.println(bArr[i]);
		}
	}
}
