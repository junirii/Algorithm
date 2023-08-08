package baekjoon.b5622;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int[] arr = new int[91];
		for (int i = 0, j=2, k=0; k < 5; i += 3, j++, k++) {//65~79
			arr[65+i] = j;
			arr[66+i] = j;
			arr[67+i] = j;
		}
		for (int i = 80; i <= 90; i++) {
			if(i <= 83) {
				arr[i] = 7;
			}else if(i <= 86) {
				arr[i] = 8;
			}else {
				arr[i] = 9;
			}
		}
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			sum += arr[(int)s.charAt(i)]+1;
		}
		System.out.println(sum);
	}
}
