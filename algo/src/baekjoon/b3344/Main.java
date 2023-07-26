package baekjoon.b3344;

import java.util.Scanner;

public class Main {
	static int[] answer;
    static int N;
    static int[] col;
    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
        N = in.nextInt(); // 한 변의 길이
        answer = new int[N+1];
        col = new int[N+1];    // 0번 행을 제외하고 작업하기 위해 1을 더한다.각 행에 하나씩만 배치할 수 있기 때문에 1차원, col[i]번째방에 여왕을 배치할 열값을 저장한다.
        setQueens(1);        // 1행부터 시도
        for (int i = 1; i <= N; i++) {
        	System.out.println(answer[i]);
        }
    }

    public static void setQueens(int rowNo){
 
        if(rowNo>N) {     // 시도하려는 rowNo행번호가 N보다 크면 말판끝까지 다 놓은 경우
            return;
        }
        for(int j=1; j<=N;j++){    // 해당 행의 1열부터 n열까지 퀸 놓는 시도
        	// j => 퀸을 놓으려는 열 번호
            col[rowNo]=j; 
            if(checking(rowNo)){ // 보통 promise 함수로 구현
            	answer[rowNo] = j;
                setQueens(rowNo+1);
            }
        }
    }

    // rowNo행에 퀸을 놓을수 있는지 1행부터 기존 rowNo-1행까지 rowNo행와 비교하며 체크
    public static boolean checking(int rowNo){
        for(int k=1; k<rowNo; k++){
            if(col[rowNo] == col[k] || Math.abs(col[rowNo]-col[k]) == rowNo-k){
            	answer = new int[N+1];
                return false;
            }
        }
        return true;
    }
}
