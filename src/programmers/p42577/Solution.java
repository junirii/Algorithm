package programmers.p42577;

public class Solution {
	public static boolean solution(String[] phone_book) {
        boolean answer = true;
        for (int i = 0; i < phone_book.length; i++) {
			for (int j = i+1; j < phone_book.length; j++) {
				if(!phone_book[i].substring(0, 1).equals(phone_book[j].substring(0, 1))) continue;
				if(phone_book[i].indexOf(phone_book[j]) == 0 || phone_book[j].indexOf(phone_book[i]) == 0) {
					answer = false;
					break;
				}
			}
		}
        
        return answer;
    }
	
	public static void main(String[] args) {
		boolean a = solution(new String[] {"12","123","1235","567","88"});
		System.out.println(a);
	}
}
