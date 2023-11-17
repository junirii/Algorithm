package boj.b27866;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n = Integer.parseInt(sc.nextLine());
		String res = s.substring(n-1, n);
		System.out.println(res);
	}
}
