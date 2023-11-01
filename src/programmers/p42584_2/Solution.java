package programmers.p42584_2;

public class Solution {
	public static void main(String[] args) {
		int[] arr = solution(new int[] {1,2,3,2,3});
		for (int i : arr) {
			System.out.println(i+" ");
		}
	}
	
	static int[] solution(int[] prices) {
		int[] answer = new int[prices.length];
		
		for (int i = 0; i < prices.length; i++) {
			int cnt = 0;
			for (int j = i+1; j < prices.length; j++) {
				cnt++;
				if(prices[j] < prices[i]) {
					break;
				}
			}
			answer[i] = cnt;
		}
		
		return answer;
	}
}
