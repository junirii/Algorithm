package baekjoon.b10810;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N+1];
		for (int i = 0; i < M; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			int n = sc.nextInt();
			for (int j = s; j <= e; j++) {
				arr[j] = n; 
			}
		}
		for (int i = 1; i <= N; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
