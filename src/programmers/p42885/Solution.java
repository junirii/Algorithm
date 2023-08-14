package programmers.p42885;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	public static int solution(int[] people, int limit) {
		int answer = 0;
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i : people) {
			list.add(i);
		}
		Collections.sort(list, Collections.reverseOrder());
		int sum = 0;
		int cnt = 0;
		while(list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				if(sum + list.get(i) <= limit) {
					sum += list.remove(i);
					i--;
					cnt++;
				}
				if(sum == limit || cnt == 2) break;
			}
			answer++;
			sum = 0;
			cnt = 0;
		}
		
        return answer;
    }
	
	public static void main(String[] args) {
		int a =solution(new int[] {70, 80, 50}, 100);
		System.out.println(a);
	}
}
