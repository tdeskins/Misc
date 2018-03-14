package codeforces;

//	http://codeforces.com/problemset/problem/275/A
import java.util.Scanner;
// EXAMPLE
//input
//1 0 0
//0 0 0
//0 0 1
//output
//001
//010
//100

public class CF275A_LightsOut {
	public static int cE(int S) {
		if (S % 2 == 0) {
			S = 1;
		} else {
			S = 0;
		}
		return S;
	}

	public static void main(String[] args) {
		// declare and initialize the input
		int[][] input = new int[3][3];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				input[i][j] = sc.nextInt();
			}
		}
		// declare and initialize the output, initially on
		int[][] output = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				output[i][j] = 1;
			}
		}
		for (int count = 0; count < 102; count++) {
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (input[i][j] > 0) {
						output[i][j] = cE(output[i][j]);
						if (i > 0) {
							output[i - 1][j] = cE(output[i - 1][j]);
						}
						if (j > 0) {
							output[i][j - 1] = cE(output[i][j - 1]);
						}
						if (i < 2) {
							output[i + 1][j] = cE(output[i + 1][j]);
						}
						if (j < 2) {
							output[i][j + 1] = cE(output[i][j + 1]);
						}
						input[i][j]--;
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(output[i][j]);
			}
			System.out.println();
		}
	}
}
