package programmers;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* H-Index를 나타내는 값인 h를 구하려고한다.
		   n편중, h번 이상 인용된 논문이 h평 이상이고, 나머지 논문이 h번 이하 인용되었다면
		   h의 최댓값이 이 과학자의 H-Index이다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] citations = new int[n];
		
		for(int i=0;i<n;i++) {
			// 논문의 인용 횟수를 담은 배열 
			citations[i] = sc.nextInt();
		}
		
		// Solution클래스 호출
		Solution s = new Solution();
		System.out.println(s.solution(citations));
	}

}


class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int j=0;j<10000;j++) {
        	int index = j; // h 
        	for(int i=0;i<citations.length;i++) {
        		// 논문에 인용횟수가 h보다 큰 경우에 1을 중가
        		if(index<=citations[i]) {answer++;}
        	}
        	// 논문에 인용횟수가 h보다 큰 경우 리스트에 h를 추가
        	if(index<=answer) {list.add(index); answer=0;}
        	// h가 논문에 인용횟수보가 큰 경우 종료
        	else {break;}
        }
        // list에서 가장 큰 값을 answer에 저장 
        answer = (Integer) list.get(list.size()-1);
        return answer;
    }
}
