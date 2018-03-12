package codeforces;

import java.util.Scanner;

public class CF1A_TheatreSquare {
	public static void main(String[] args) {
		double n,m,a;
		long j,k;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		a = sc.nextInt();
		j = (long) Math.ceil(n/a);
		k = (long) Math.ceil(m/a);
		long number = j*k;
		System.out.println(number);
	}
}
