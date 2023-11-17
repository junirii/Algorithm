package boj.b2562;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = Integer.MIN_VALUE;
		int seq = 0;
		for (int i = 1; i <= 9; i++) {
			int num = sc.nextInt();
			if(num > max) {
				max = num;
				seq = i;
			}
		}
		System.out.println(max);
		System.out.println(seq);
	}
}
