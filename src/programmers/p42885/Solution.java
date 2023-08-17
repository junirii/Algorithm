package programmers.p42885;

import java.util.Arrays;

public class Solution {
	public static int solution(int[] people, int limit) {
		int answer = 0;
		int idx = 0;
		Arrays.sort(people);
		for (int i = people.length-1; i >= 0 ; i--) {
			if(idx > i) break;
			if(people[i] + people[idx] <= limit) {
				idx++;
			}
			answer++;
		}
        return answer;
    }
	
	public static void main(String[] args) {
		int a =solution(new int[] {70, 50, 80, 40, 90, 30, 100, 20, 10, 60}, 100);
		System.out.println(a);
	}
}
