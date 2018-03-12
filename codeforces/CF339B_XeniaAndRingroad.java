package codeforces;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CF339B_XeniaAndRingroad {
	public static CF339B_XeniaAndRingroad ex;

	// h is the starting location at Xenia's house
	private final int h = 1;

	// n number of houses, 2<=n<=1E5
	private int n;

	// m number of things to do, 1<=m<=1E5
	private int m;

	// house number a[m] containing mth thing to do, 1<=a<=m
	// first-in-first-out would suit this problem
	int[] a;
	Queue<Integer> b;

	int k;

	/*-----------------------------------
	 * INPUT: n m a1 a2 .. am
	 -----------------------------------*/

	private int t;

	/*-----------------------------------
	 * OUTPUT: one integer: t (time it takes to complete all tasks)
	 -----------------------------------*/

	private CF339B_XeniaAndRingroad() {
		Scanner sc = new Scanner(System.in);
		this.n = sc.nextInt();
		this.m = sc.nextInt();
		a = new int[this.m];
		b = new LinkedList<>();

		int i;

		for (i = 0; i < m; i++) {
			k = sc.nextInt();
			a[i] = k;
			b.add(k);
		}

//		System.out.println("counter initialized");
		this.t = 0;
		i = 0;
		while (i <= (n - 1) * m) {
//			System.out.println("b is " + b.toString());
//			System.out.println("steps taken: " + this.t);
//			System.out.println("i%n+1 is " + ((i % n) + 1));
//			System.out.println("------------------");
			if (b.peek() == ((i % n) + 1)) {
				k = b.remove();
				while (!b.isEmpty() && k == b.element()) {
					k = b.remove();
				}
			}
			if (b.isEmpty()) {
				break;
			}
			i++;
			t++;
		}
		System.out.println(t);
//		System.out.println("STEPS EQUAL " + t);
	}

	public static void main(String[] args) {
		ex = new CF339B_XeniaAndRingroad();
	}
}
