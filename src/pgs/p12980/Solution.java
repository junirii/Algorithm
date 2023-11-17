package pgs.p12980;

public class Solution {
    public static int solution(int n) {
        int ans = 0;
        while(n > 0) {
        	if(n%2 == 0) {
        		n /= 2;
        	}else {
        		n -= 1;
        		ans++;
        	}
        }
        return ans;
    }
	
	public static void main(String[] args) {
		int a = solution(5000);
		System.out.println(a);
	}
}
