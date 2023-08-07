package baekjoon.b10813;

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
			int a = sc.nextInt();
			int b = sc.nextInt();
			int aNum = arr[a];
			arr[a] = arr[b];
			arr[b] = aNum;
		}
		for (int i = 1; i <= N; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
