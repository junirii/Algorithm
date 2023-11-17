package pgs.p87946;

public class Solution {
	static boolean[] visited;
	static int maxCnt;
	
	public static int solution(int k, int[][] dungeons) {
        for (int i = 0; i < dungeons.length; i++) {
        	visited = new boolean[dungeons.length];
        	if(k >= dungeons[i][1]) {
        		dfs(i, dungeons, k-dungeons[i][1], 1);
        	}
		}
        
        return maxCnt;
    }
	
	public static void dfs(int idx, int[][] dungeons, int remain, int cnt) {
		visited[idx] = true;
		
		boolean isEnd = true;
		for (int i = 0; i < dungeons.length; i++) {
			if(visited[i] == false && dungeons[i][0] <= remain) {
				isEnd = false;
				dfs(i, dungeons, remain-dungeons[i][1], cnt+1);
			}
		}
		visited[idx] = false;
		
		if(isEnd) {
			maxCnt = Math.max(maxCnt, cnt);
		}
	}
	
	public static void main(String[] args) {
		int a = solution(80, new int[][] {{80,20},{50,40},{30,10}});
		System.out.println(a);
	}
}
