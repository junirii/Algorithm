package baekjoon.b1743;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static int[] dx = {-1, 0, 0, 1};
	public static int[] dy = {0, 1, -1, 0};
	public static int[][] arr;
	public static boolean[][] visited;
	public static int max, size, h, w;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		h = sc.nextInt();
		w = sc.nextInt();
		arr = new int[h+1][w+1];
		visited = new boolean[h+1][w+1];
		int N = sc.nextInt();
		for (int i = 0; i < N; i++) {
			int h1 = sc.nextInt();
			int w1 = sc.nextInt();
			arr[h1][w1]++;
		}
		for (int i = 1; i <= h; i++) {
			for (int j = 1; j <= w; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
		search(1, 1);
		System.out.println(max);
	}
	
	public static void search(int h1, int w1) {
		Queue<int[]> q = new LinkedList<int[]>();
		q.add(new int[]{h1, w1});
		visited[h1][w1] = true;
		if(arr[h1][w1] == 1) size++;
		
		while(!q.isEmpty()) {
			int[] a = q.poll();
			int oldH = a[0];
			int oldW = a[1];
			if(arr[oldH][oldW] == 1) {
				System.out.println(oldH+"/"+oldW+"/"+size);
				size++;
				max = Math.max(max, size);
			} else {
				size = 0;
			}
			for (int i = 0; i < 4; i++) {
				int newH = oldH + dy[i];
				int newW = oldW + dx[i];
				if(newH > 0 && newH <= h && newW > 0 && newW <= w && visited[newH][newW] == false) {
					visited[newH][newW] = true;
					q.add(new int[] {newH, newW});
				}
			}
		}
	}
}
