package a2OnlineJudge;

import java.util.Scanner;

public class A2OJ_1 {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y, T;
		T = sc.nextInt();
		int xyArr[] = new int[T];
		for (int i=0; i<T; i++) {
			x = sc.nextInt();
			y = sc.nextInt();
			xyArr[i]=x+y;
		}
		for (int in : xyArr) {
			System.out.println(in);
		}
	}
}
