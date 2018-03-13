package codeforces;

import java.util.Scanner;

public class CF266B_QueueAtTheSchool {
	public static void main(String[] args) {
		// n people in the Queue, 1 is first
		// 'B' boy 'G' girl
		// for x=0 x < t
		// if time x, boy is at i and i+1 is a girl,
		// then time x+1, switch i and i+1
		int n, t;
		String input;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		t = sc.nextInt();
		sc.nextLine(); // consume \n
		char[] QatS = new char[n];
		input = sc.nextLine();
		// for all positions add to QatS
		for (int p = 0; p < n; p++) {
			QatS[p] = input.charAt(p);
		}
		for (int x = 0; x < t; x++) {
			// use switched[] to prevent skipping the queue
			boolean[] switched = new boolean[n];
			for (int p = 0; p < (n - 1); p++) {
				if (QatS[p] == 'B' && QatS[p + 1] == 'G' && switched[p] == false) {
					QatS[p] = 'G';
					QatS[p + 1] = 'B';
					switched[p + 1] = true;
				}
			}
		}
		for (int p = 0; p < n; p++) {
			System.out.print(QatS[p]);
		}
	}
}
