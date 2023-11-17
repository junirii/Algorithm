package boj.b1414;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main{
	static int N;
	static int[] parent;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); // 입력값 읽기 세팅
		N = Integer.parseInt(br.readLine()); // 컴퓨터 개수 저장
		
		char[][] arr = new char[N][N]; // 랜선의 길이 담을 2차원 배열 정의
		for(int i=0; i<N; i++) {
			arr[i] = br.readLine().toCharArray(); // 랜선의 길이 2차원 배열에 저장
		}
		
		parent = new int[N+1]; // 유니온 파인드 구현을 위한 부모 배열 정의
		for(int i=1; i<=N; i++) {
			parent[i] = i; // 기본 연결값 넣기
		}
		
		int total = 0; // 전체 랜선 길이 합 변수 정의
		Queue<Node> q = new PriorityQueue<>(); // Node 클래스 내 value 속성값 오름차순으로 정렬 위한 PriorityQueue 정의
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if('a' <= arr[i][j] && arr[i][j] <= 'z') {
					total += arr[i][j]-96; // 'a' ~ 'z'는 97 ~ 122 이므로 96을 빼서 길이 합에 추가
					q.add(new Node(i+1, j+1, arr[i][j]-96)); // 해당 노드 생성하여 큐에 추가(i, j는 0부터 시작이라 1 더함) 
				}else if('A' <= arr[i][j] && arr[i][j] <= 'Z') {
					total += arr[i][j]-38; // 'A' ~ 'Z'는 65 ~ 90 이므로 38을 빼서 길이 합에 추가
					q.add(new Node(i+1, j+1, arr[i][j]-38)); // 해당 노드 생성하여 큐에 추가(i, j는 0부터 시작이라 1 더함)
				}
			}
		}
		
		int cnt = 1; // 카운트 변수 정의
		int result = 0; // 정답 변수 정의
		while(!q.isEmpty()) { // 큐에 데이터가 모두 없어질 때까지 반복
			Node node = q.poll(); // 큐 내 Node 클래스 중 value 속성값이 가장 낮은 순으로 추출
			int a = find(node.to); // 해당 Node 클래스 내 to 속성값의 parent 연결값 정의 
			int b = find(node.from); // 해당 Node 클래스 내 from 속성값의 parent 연결값 정의
			if(a != b) { // 연결되어 있지 않으면
				cnt++; // 카운트 값 증가
				result += node.value; // 정답 변수에 해당 value 값만큼 더하기
				union(node.to, node.from); // union 함수를 통해 두 노드 연결
			}
		}
		
		if(cnt != N) { // 카운트 변수값이 N보다 작으면
			System.out.println(-1); // 노드들이 모두 연결되어 있지 않다는 뜻이므로, -1 반환
		}else { // 카운트 변수값이 N이면
			System.out.println(total-result); // 노드들이 모두 연결되었으므로, 전체 랜선 길이에서 result에 추가한 값 빼서 반환
			// result = 다솜이가 모든 컴퓨터를 연결하기 위한 랜선의 최소 길이
			// total - result = 다솜이가 기부할 수 있는 랜선의 최대 길이
		}
	}
	
	// 서로 연결된 랜선 길이값들을 저장하기 위한 Node 클래스 정의
	static class Node implements Comparable<Node>{
		// 노드 속성값 정의
		int to;
		int from;
		int value;
		
		// 생성자 함수 정의
		public Node(int to, int from, int value) {
			this.to = to;
			this.from = from;
			this.value = value;
		}
		
		// Comparable 인터페이스를 통해 정렬 방식 정의 - value 속성값(랜선 길이) 기준으로 오름차순 정렬
		@Override
		public int compareTo(Node o) {
		return this.value - o.value;
		}
	}
	
	// find 함수 정의
	static int find(int x) {
		// 해당 값이 parent 배열의 연결값과 같다면 해당 값 리턴
		if (parent[x] == x) { 
			return x; 
	     } 
		
		// 그렇지 않을 경우 해당 연결값으로 find 함수 재귀
		return parent[x] = find(parent[x]);
	} 
	
	// union 함수 정의
	static void union(int x, int y) { 
	    if (find(x) < find(y)) { // x의 연결값이 y의 연결값보다 작다면
	    	parent[find(y)] = find(x); // y의 연결값에 x의 연결값 저장
	    } else { // y의 연결값이 x의 연결값보다 작다면
	    	parent[find(x)] = find(y); // x의 연결값에 y의 연결값 저장
	    } 
	}	
}