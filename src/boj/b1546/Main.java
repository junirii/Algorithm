package boj.b1546;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		double[] arr = new double[N];
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < N; i++) {
			int n = sc.nextInt();
			arr[i] = n;
			max = Math.max(max, n);
		}
		double sum = 0;
		for (int i = 0; i < N; i++) {
			arr[i] = arr[i]/max*100;
			sum += arr[i];
		}
		System.out.println(sum/N);
	}
}
