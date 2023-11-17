package boj.b10952;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = sc.nextInt() + sc.nextInt();
		while(sum > 0) {
			System.out.println(sum);
			sum = sc.nextInt() + sc.nextInt();
		}
	}
}
