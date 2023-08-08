package baekjoon.b2908;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		int new_a = Integer.parseInt(a.substring(2, 3) + a.substring(1, 2) + a.substring(0, 1)); 
		int new_b = Integer.parseInt(b.substring(2, 3) + b.substring(1, 2) + b.substring(0, 1));
		System.out.println(Math.max(new_a, new_b));
	}
}
