package programmers.p70129;

public class Solution {
    public static int[] solution(String s) {
    	int cnt = 0;
    	int zeroCnt = 0;
    	while(s.length() != 1) {
    		for (int i = 0; i < s.length(); i++) {
				if(s.charAt(i) == '0') zeroCnt++;
			}
    		String new_s = s.replaceAll("0", "");
    		int oneCnt = 0;
    		for (int i = 0; i < new_s.length(); i++) {
				if(new_s.charAt(i) == '1') oneCnt++; 
			}
    		s = Integer.toBinaryString(oneCnt);
    		cnt++;
    	}
        int[] answer = new int[2];
        answer[0] = cnt;
        answer[1] = zeroCnt; 
        return answer;
    }
    public static void main(String[] args) {
    	int[] arr = solution("1111111");
    	for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
    }
}
