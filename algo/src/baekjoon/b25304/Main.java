package baekjoon.b25304;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int n = sc.nextInt();
		int sum = 0;
		for (int i = 0; i < n; i++) {
			int money = sc.nextInt();
			int cnt = sc.nextInt();
			sum += money*cnt;
		}
		if(sum == total) System.out.println("Yes");
		else System.out.println("No");
	}
}