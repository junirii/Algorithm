package baekjoon.b9086;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for (int i = 0; i < n; i++) {
			String s = sc.nextLine();
			System.out.print(s.substring(0, 1));
			System.out.println(s.substring(s.length()-1, s.length()));
		}
	}
}
