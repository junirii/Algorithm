package baekjoon.b14888;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int[] math = new int[4];
		for (int i = 0; i < 4; i++) {
			math[i] = sc.nextInt();
		}
		int max = arr[0]; 
		int min = arr[0];
		int idx = 1;
		
		
		System.out.println(max);
		System.out.println(min);
	}
}