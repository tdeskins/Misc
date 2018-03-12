package codeforces;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CF4C_RegistrationSystem {
/* ---------------------------------------
 * Input: an integer n for number of lines
 * Followed by n lines of string
 * ---------------------------------------
 * Output: OK if string is accepted
 * string1 if string is found in system
 * string2 if string1 is found in system, etc.
 * ---------------------------------------*/
	public static void main(String[] args) {
		int i;
		int n;
		String inpString;
		String name;
		Queue<String> q = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		for (int j = 0; j <= n; j++) {
			i = 1;
			inpString = sc.nextLine();
			name = inpString;
			while (q.contains(name)) {
				name = inpString + Integer.toString(i);
				i++;
			}
			q.add(name);
		}
		q.remove();
		while (!q.isEmpty()) {
			if (Character.isDigit(q.element().charAt(q.element().length() - 1))) {
				System.out.println(q.element());
			} else {
				System.out.println("OK");
			}
			q.remove();
		}
	}
}
