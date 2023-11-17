package pgs.p42586;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public static void main(String[] args) {
		int[] arr = solution(new int[] {95,90,99,99,80,99}, new int[] {1,1,1,1,1,1});
		for (int i : arr) {
			System.out.println(i);
		}
	}
	
	static int[] solution(int[] progresses, int[] speeds) {
		int[] days = new int[progresses.length];
		for (int i = 0; i < progresses.length; i++) {
			int day = (100-progresses[i])/speeds[i];
			if((100-progresses[i])%speeds[i] > 0) day++;
			days[i] = day;
		}
		
		int cnt = 1;
		List<Integer> l = new ArrayList<Integer>();
		for (int i = 0; i < days.length; i += cnt) {
			cnt = 1;
			if(i == days.length-1) l.add(cnt);
			for (int j = i+1; j < days.length; j++) {
				if(days[j] <= days[i]) {
					cnt++;
					if(j == days.length-1) l.add(cnt);
				}else {
					l.add(cnt);
					break;
				}
			}
		}
		
		int[] answer = new int[l.size()];
		int idx = 0;
		for (int i : l) {
			answer[idx++] = i;
		}
		
		return answer;
	}
}
