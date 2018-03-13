package a2OnlineJudge;

import java.util.Arrays;
import java.util.Scanner;

public class A2OJ_193 {
	public static void main(String[] args) {

		// /* To do:
		// * create an int array with 26 elements
		// * take in string
		// * turn into a character array
		// * sort characters Arrays.sort(chars)
		// * i = 0
		// * while char[i]==character[i+1], alphArray[((int)(char[i])-96)]++
		// * i++;
		// */

		int T;
		String stock = "";
		int[] alphArray = new int[26];
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();
		for (int i = 0; i < T + 1; i++) {
			stock = sc.nextLine();
			char[] chars = stock.toCharArray();
			Arrays.sort(chars);
			for (int k = 1; k < chars.length; k++) {
				if (chars[k] == chars[k - 1]) {
					alphArray[(int) (chars[k]) - 97]++;
				}
			}
		}
		System.out.println(alphArray[0]);// add one at the end
	}
}