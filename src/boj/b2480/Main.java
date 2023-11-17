package boj.b2480;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[7];
		arr[sc.nextInt()]++;
		arr[sc.nextInt()]++;
		arr[sc.nextInt()]++;
		int max = 0;
		int num = 0;
		for (int i = 1; i <= arr.length-1; i++) {
			if(arr[i] >= max) {
				max = arr[i];
				num = i;
			}
		}
		if(max == 3) {
			System.out.println(num*1000 + 10000);
		}else if(max == 2) {
			System.out.println(num*100 + 1000);
		}else {
			System.out.println(num*100);
		}
	}
}
