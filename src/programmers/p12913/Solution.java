package programmers.p12913;

public class Solution {
	static int solution(int[][] land) {
        int answer = 0;
        int[] visited = new int[land.length];
        for (int i = 0; i < land.length; i++) {
			int[] arr = land[i];
			int max = 0;
			for (int j = 0; j < arr.length; j++) {
				if(arr[j] > max) {
					if(i == 0 || visited[i-1] != j) {
						max = arr[j];
						visited[i] = j;
					}
				}
			}
			System.out.println("max:"+max);
			for (int j : visited) {
				System.out.println("visited:"+j);
			}
			answer += max;
		}

        return answer;
    }
	public static void main(String[] args) {
		System.out.println(solution(new int[][] {{1,2,3,5},{5,6,7,8},{4,3,2,1}}));
	}
}
