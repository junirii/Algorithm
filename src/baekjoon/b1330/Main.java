package baekjoon.b1330;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringTokenizer st = new StringTokenizer(sc.nextLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		String result;
		if(a > b) result = ">";
		else if(a < b) result = "<";
		else result = "==";
		System.out.println(result);
	}
}
