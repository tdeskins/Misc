package codeforces;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CF32B_Borze {
	public static void main(String[] args) {
		final Map<String, String> borzeDict = new HashMap<>();
		borzeDict.put(".", "0");
		borzeDict.put("-.", "1");
		borzeDict.put("--", "2");
		Scanner sc = new Scanner(System.in);
		StringBuffer input = new StringBuffer();
		StringBuffer output = new StringBuffer();
		input.append(sc.nextLine());
		for (int i = 0; i < input.length(); i++) {
			if ((String.valueOf(input.charAt(i)).equals("."))) {
				output.append(borzeDict.get(String.valueOf(input.charAt(i))));
			} else {
				// it is either 1 or 2
				if ((String.valueOf(input.charAt(i + 1)).equals("."))) {
					output.append(borzeDict.get("-."));
					i++;
				} else {
					output.append(borzeDict.get("--"));
					i++;
				}
			}
		}
		System.out.println(output);

	}
}
