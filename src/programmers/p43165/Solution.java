package programmers.p43165;

public class Solution {
	static int n, static_target, static_answer, cnt;
	static int[] static_numbers;
    public static int solution(int[] numbers, int target) {
        int answer = 0;
        static_target = target;
        static_numbers = numbers;
        n = numbers.length;
        for (int i = 0; i <= 1; i++) {
			dfs(i, 0, 0);
		}
        answer = static_answer/2;
        return answer;
    }
    
    public static void dfs(int plus, int idx, int result) {
    	if(idx == n) {
    		cnt++;
    		if(result == static_target) static_answer++;
    		return;
    	}
    	if(plus == 0) {
    		result -= static_numbers[idx];
    	}else {
    		result += static_numbers[idx];
    	}
    	for (int i = 0; i <= 1; i++) {
    		dfs(i, idx+1, result);
		}
    }
    
    public static void main(String[] args) {
//		int a = solution(new int[] {1,1,1,1,1}, 3);
		int a = solution(new int[] {4,1,2,1}, 2);
		System.out.println(a);
	}
}
