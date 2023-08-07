package baekjoon.b10818;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			int num = sc.nextInt();
			min = Math.min(min, num);
			max = Math.max(max, num);
		}
		System.out.print(min + " " + max);
	}
}
