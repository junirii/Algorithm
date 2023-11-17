package boj.b10811;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] arr = new int[N+1];
		for (int i = 1; i <= N; i++) {
			arr[i] = i;
		}
		for (int i = 0; i < M; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			for (int j = s, k = e, z = 1; z <= (e-s+1)/2; j++, k--, z++) {
				int s_num = arr[j];
				arr[j] = arr[k];
				arr[k] = s_num;
			}
		}
		for (int i = 1; i <= N; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
