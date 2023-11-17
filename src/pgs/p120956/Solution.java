package pgs.p120956;

public class Solution {
	public static void main(String[] args) {
		int a = solution(new String[] {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"});
		System.out.println(a);
	}
	
	static int solution(String[] babbling) {
		int answer = 0;
		
		String[] words = new String[] {"aya", "ye", "woo", "ma"};
		
		for (int i = 0; i < babbling.length; i++) {
			String babbling_tmp = babbling[i];
			for (int j = 0; j < words.length; j++) {
				if(babbling[i].contains(words[j])) {
					babbling_tmp = babbling_tmp.replaceFirst(words[j], "");
				}
			}
			if(babbling_tmp.equals("")) answer++;
		}
		
		return answer;
	}
}
