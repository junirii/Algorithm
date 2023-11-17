package boj.b11022;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int sum = a+b;
			sb.append("Case #"+i+": "+a+" + "+b+" = "+sum+"\n");
		}
		System.out.println(sb);
	}
}
