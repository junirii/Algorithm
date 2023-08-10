package programmers.p42626;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static int solution(int[] scoville, int K) {
    	int answer = 0;
    	ArrayList<Integer> sList = new ArrayList<Integer>();
    	Arrays.sort(scoville);
    	for (int i: scoville) {
			sList.add(i);
		}
    	
    	while(true) {
    		for (Integer i : sList) {
			}
    		if(sList.get(0) >= K) break;
    		
    		int a = sList.remove(0);
    		int b = sList.remove(1);
    		int c = a + b*2;
    		sList.add(0, c);
    		answer++;
    	}
    	
        return answer;
    }
    
    public static void main(String[] args) {
		int a = solution(new int[]{1,2,3,9,10,12}, 7);
		System.out.println(a);
	}
}
