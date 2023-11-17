package boj.b11021;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			int sum = sc.nextInt() + sc.nextInt();
			sb.append("Case #"+i+": "+sum+"\n");
		}
		System.out.println(sb);
	}
}
