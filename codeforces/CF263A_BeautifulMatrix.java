package codeforces;

import java.util.Scanner;

public class CF263A_BeautifulMatrix {
	public static void main(String[] args) {
		// declare matrix, initialize with zeroes
		int[][] A = new int[5][5];

		// initialize scanner
		Scanner sc = new Scanner(System.in);
		int ind = 0;
		// detect location of 1
		while (sc.nextInt() == 0) {
			ind++;
		}
		System.out.println(); // consume \n

		// r1: row of 1, c1: column of 1
		// rE and cE represent row and column of center
		// initialize number of steps to get to the center
		int r1 = ind / 5, c1 = ind % 5, rE = 2, cE = 2, steps = 0;

		if (r1 < rE) {
			while (r1 < rE) {
				r1++;
				steps++;
			}
		}
		if (c1 < cE) {
			while (c1 < cE) {
				c1++;
				steps++;
			}
		}
		if (r1 > rE) {
			while (r1 > rE) {
				r1--;
				steps++;
			}
		}
		if (c1 > cE) {
			while (c1 > cE) {
				c1--;
				steps++;
			}
		}
		System.out.println(steps);
	}
}
