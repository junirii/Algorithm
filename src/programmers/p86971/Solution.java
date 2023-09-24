package programmers.p86971;

public class Solution {
	static int[][] arr;
	static boolean[] check;
	static int cnt, cnt_tmp;
	public static int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        
        for (int i = 0; i < wires.length; i++) {
        	cnt = 0;
        	cnt_tmp = 0;
        	arr = new int[n+1][n+1];
        	check = new boolean[n+1];
        	for(int j = 0; j < wires.length; j++) {
        		if(i == j) continue;
        		arr[wires[j][0]][wires[j][1]] = 1;
        		arr[wires[j][1]][wires[j][0]] = 1;
        	}
        	dfs(1);
        	cnt = cnt_tmp;
        	cnt_tmp = 0;
        	for (int j = 1; j < check.length; j++) {
        		if(check[j] == false) dfs(j);
        	};
        	System.out.println("i:"+i+"/"+cnt+"/"+cnt_tmp);
        	answer = Math.min(Math.abs(cnt - cnt_tmp), answer);
		}
        
        return answer;
    }
	
	public static void dfs(int start) {
		cnt_tmp++;
		check[start] = true;
		for (int i = 1; i < arr.length; i++) {
			if(arr[start][i] == 1 && check[i] == false) {
				dfs(i);
				
			}
		}
	}
	
	public static void main(String[] args) {
		int a = solution(9, new int[][]{{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}});
//		int a = solution(4, new int[][]{{1,2},{2,3},{3,4}});
		System.out.println(a);
	}
}
