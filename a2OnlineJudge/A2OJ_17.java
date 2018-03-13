package a2OnlineJudge;

import java.util.Scanner;

public class A2OJ_17 {
	public static void main(String[] args) {
		// declaration
		int t;
		int[] max = new int[101];
		char[] index = new char[101];
		
		// the count array acts as a key for the values of the input
		int[][] countArr = new int[26][101];
		String candyStock;

		// initialize scanner
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();

		// loop through all test cases
		for (int i = 0; i <= t; i++) {
			// initialize max and index arrays for each case
			max[i] = 0;
			index[i] = 'z';
			candyStock = sc.nextLine();

			// convert input string to character array
			char[] charArr = candyStock.toCharArray();

			// loop through character array (the input)
			for (int k = 0; k < charArr.length; k++) {
				// countArr tracks the number of instances for each character
				countArr[(int) (charArr[k]) - 97][i]++;
			}
			for (int g = 0; g < 26; g++) {
				// keep track of the index and map, following the given rules
				if (countArr[g][i] == max[i] && (g < (int) (index[i]) - 97)) {
					// 'a' has an integer value of 97, 'b' = 98, etc
					index[i] = (char) (g + 97);
				} else if (countArr[g][i] > max[i]) {
					max[i] = countArr[g][i];
					index[i] = (char) (g + 97);
				}
			}
		}
		// for each test case, print the most-occurring character's # and name
		for (int i = 1; i <= t; i++) {
			System.out.println(Integer.toString(max[i]) + " " + Character.toString(index[i]));
		}
	}
}
