package codeforces;

import java.util.Scanner;

public class CF69A_YoungPhysicist {
	public static void main(String[] args) {
		int n;
		boolean output = true;
		String input;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		sc.nextLine();
		int[][] num = new int[3][n];
		for (int i = 0; i < n; i++) {
			input = sc.nextLine();
			String[] numbers = input.split(" ");
			for (int i1 = 0; i1 < 3; i1++) {
				num[i1][i] = Integer.parseInt(numbers[i1]);
			}
		}
		for (int j1 = 0; j1 < 3; j1++) {
			for (int j = 1; j < n; j++) {
				num[j1][0] += num[j1][j];
			}
			if (num[j1][0] != 0) {
				output = false;
			}
		}
		if (output == true) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
