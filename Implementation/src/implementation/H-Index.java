package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] citations = new int[n];
		
		for(int i=0;i<n;i++) {
			citations[i] = sc.nextInt();
		}
		
		/* H-Index를 나타내는 값인 h를 구하려고한다.
		   n편중, h번 이상 인용된 논문이 h평 이상이고, 나머지 논문이 h번 이하 인용되었다면
		   h의 최댓값이 이 과학자의 H-Index이다.
		 */
		
		Solution s = new Solution();
		System.out.println(s.solution(citations));
	}

}


class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<Integer>();

        for(int j=0;j<10000;j++) {
        	int index = j;
        	for(int i=0;i<citations.length;i++) {
        		if(index<=citations[i]) {answer++;}
        	}
        	if(index<=answer) {list.add(index); answer=0;}
        	else {break;}
        }
        
        answer = (Integer) list.get(list.size()-1);
        return answer;
    }
}
