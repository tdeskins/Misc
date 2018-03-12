package a2OnlineJudge;

import java.util.Scanner;

public class A2OJ_6 {
	public static void main(String[] args) {
		// EXAMPLE INPUT
		// 4 T
		// 3 1 2 N X Y
		// 1 3 2 COLORS 1...N
		// 5 3 4
		// 3 1 2 4 5
		// 6 1 6
		// 2 1 3 4 5 6
		// 7 7 7
		// 1 7 2 3 4 5 6
		// EXAMPLE OUTPUT
		// - "BOTH": If both the easiest and hardest problems got colors which they
		// should not get.
		//
		// - "EASY": If only the easiest problem got a color which it should not get.
		//
		// - "HARD": If only the hardest problem got a color which it should not get.
		//
		// - "OKAY": If both the easiest and hardest problems got colors which they can
		// get.
		int T, N, X, Y, count;
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		int[][] colors = new int[101][T]; // 100 is N's max value
		String[] output = new String[T];
		for (int i = 0; i < T; i++) {
			count = -1;
			output[i] = "OKAY"; // set it OKAY at first
			N = sc.nextInt();
			X = sc.nextInt();
			Y = sc.nextInt();
			for (int j = 0; j < N; j++) {
				colors[j][i] = sc.nextInt();
				count++;
			}
			if (colors[0][i] == X) {
				output[i] = "EASY";
			}
			if (colors[count][i] == Y) {
				output[i] = "HARD";
			}
			if (colors[0][i] == X && colors[count][i] == Y) {
				output[i] = "BOTH";
			}
		}
		for (int i = 0; i < T; i++) {
			System.out.println(output[i]);
		}
	}
}
