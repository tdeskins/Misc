package codeforces;

/**
 given a year, returns the next year with completely unique digits
 EXAMPLE
 ----------------
 |input:	1991 |
 |output:	2013 |
 ----------------|
 |input:	2013 |
 |output:	2014 |
 ----------------
 */
import java.util.Scanner;

public class CF271A_BeautifulYear {
	public static void main(String[] args) {
		// declare variables
		String inYear;
		boolean isUnique = false;

		// initialize scanner
		Scanner sc = new Scanner(System.in);
		inYear = sc.nextLine(); // read input
		int outYear = Integer.parseInt(inYear); // initialize output
		
		// find the next unique year
		while (isUnique == false) {
			outYear++; 
			isUnique = true;
			char[] digits = Integer.toString(outYear).toCharArray();
			for (int i = 0; i < inYear.length(); i++) {
				for (int j = 0; j < inYear.length(); j++) {
					if (i != j) {
						if (digits[i] == digits[j]) {
							// not unique
							isUnique = false;
						}
					}
				}
			}
		}
		System.out.println(outYear);
	}
}
