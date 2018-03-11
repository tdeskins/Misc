package codeforces;

import java.io.*;
import java.util.*;

public class CF118A_StringTask {
	public static void main(String[] args) {
		/**
		 * given a string 1) Delete all the vowels 2) Insert a "." before each consonant
		 * 3) Replace all uppercase consonants with corresponding lowercase ones
		 */

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		input = input.toLowerCase();

		int len = input.length();
		ArrayList<Character> arrli = new ArrayList<Character>(len);
		char x;

		for (int i = 0; i < len; i++) {
			x = input.charAt(i);
			if ((x == 'a') || (x == 'e') || (x == 'i') || (x == 'o') || (x == 'u') || (x == 'y')) {
				continue;
			}
			arrli.add('.');
			arrli.add(x);
		}
		Iterator<Character> it = arrli.iterator();
		StringBuilder sb = new StringBuilder();

		while (it.hasNext()) {
			sb.append(it.next());
		}
		System.out.println(sb.toString());
	}
}
