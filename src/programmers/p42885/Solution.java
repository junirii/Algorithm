package programmers.p42885;

import java.util.Collections;
import java.util.PriorityQueue;

public class Solution {
	public static int solution(int[] people, int limit) {
		int answer = 0;
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int i : people) {
			q.add(i);
		}
		int sum = 0;
		int cnt = 0;
		while(true) {
			if(q.isEmpty()) break;
			PriorityQueue<Integer> q_temp = new PriorityQueue<Integer>(Collections.reverseOrder());
			int size = q.size();
			for (int i = 0; i < size; i++) {
				int num = q.poll();
				if(cnt == 2) {
					q_temp.add(num);
					continue;
				}else {
					if(sum + num <= limit) {
						sum += num;
						cnt++;
					}else {
						q_temp.add(num);
					}
				}
			}
 			q = q_temp;
			answer++;
			sum = 0;
			cnt = 0;
		}
		
        return answer;
    }
	
	public static void main(String[] args) {
		int a =solution(new int[] {70, 50, 80, 40, 90, 30, 100, 20, 10, 60}, 100);
		System.out.println(a);
	}
}
