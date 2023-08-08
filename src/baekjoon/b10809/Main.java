package baekjoon.b10809;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] cArr = sc.nextLine().toCharArray();
		int[] arr = new int[26];
		boolean[] visited = new boolean[26];
		for (int i = 0; i < 26; i++) {
			arr[i] = (char)97+i;
		}
		for (int i = 0; i < arr.length; i++) {
			int cnt = 0;
			for (int j = 0; j < cArr.length; j++) {
				if(!visited[i] && arr[i] == cArr[j]) {
					System.out.print(j + " ");
					visited[i] = true;
					cnt++;
				}
			}
			if(cnt == 0) System.out.print("-1 ");
		}
	}
}
