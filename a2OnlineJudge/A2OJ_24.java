package a2OnlineJudge;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class A2OJ_24 {
	public static void main(String[] args) {
		// declaration
		int T;
		int[] N = new int[101]; // for each T
		boolean engDetect;
		String[] input = new String[101];
		String[][] strA = new String[101][101];
		Deque<String> inFormer = new LinkedList<>();
		String[] eng = new String[101]; // for each T
		Deque<String> inLatter = new LinkedList<>();

		// initialize scanner
		Scanner sc = new Scanner(System.in);

		// user inputs number of test cases
		T = sc.nextInt();
		// consume nextline
		sc.nextLine();
		for (int i = 0; i < T; i++) {
			engDetect = false;
			inFormer.clear();
			inLatter.clear();
			N[i] = sc.nextInt();
			sc.nextLine();
			input[i] = sc.nextLine();
			String[] inArr = input[i].split(" ");
			for (int j = 0; j < N[i]; j++) {
				// for all strings in the input array
				if (inArr[j].charAt(0) != '#') {
					engDetect = true;
					eng[i] = inArr[j];
				}
				if (engDetect == false) {
					// add to the end of inFormer
					inFormer.addLast(inArr[j]);
				}
				if (engDetect == true && inArr[j].charAt(0) == '#') {
					// add to the end of inLatter
					inLatter.addLast(inArr[j]);
				}
			}
			int iLS = inLatter.size();
			int iFS = inFormer.size();
			if (engDetect == false) {
				for (int ai = 0; ai < inArr.length; ai++) {
					strA[ai][i] = inArr[ai];
				}
			} else {
				for (int k1 = 0; k1 < iLS; k1++) {
					// add inLatter to beginning of strA[i]
					strA[k1][i] = inLatter.removeFirst();
				}
				// add english string to strA[i]
				strA[iLS][i] = eng[i];
				for (int k2 = 0; k2 < iFS; k2++) {
					strA[iLS + 1 + k2][i] = inFormer.removeFirst();
				}
			}
		}
		for (int i1 = 0; i1 < T; i1++) {
			for (int k = 0; k < N[i1]; k++) {
				System.out.print(strA[k][i1] + " ");
			}
			System.out.println();
		}
	}
}
