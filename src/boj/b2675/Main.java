package boj.b2675;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(sc.nextLine());
			int roof = Integer.parseInt(st.nextToken());
			String s = st.nextToken();
			for (int k = 0; k < s.length(); k++) {
				for (int j = 0; j < roof; j++) {
					System.out.print(s.charAt(k));
				}
			}
			System.out.println();
		}
	}
}
