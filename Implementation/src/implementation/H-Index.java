package programmers;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* H-Index�� ��Ÿ���� ���� h�� ���Ϸ����Ѵ�.
		   n����, h�� �̻� �ο�� ���� h�� �̻��̰�, ������ ���� h�� ���� �ο�Ǿ��ٸ�
		   h�� �ִ��� �� �������� H-Index�̴�.
		 */
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int[] citations = new int[n];
		
		for(int i=0;i<n;i++) {
			// ���� �ο� Ƚ���� ���� �迭 
			citations[i] = sc.nextInt();
		}
		
		// SolutionŬ���� ȣ��
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
        		// ���� �ο�Ƚ���� h���� ū ��쿡 1�� �߰�
        		if(index<=citations[i]) {answer++;}
        	}
        	// ���� �ο�Ƚ���� h���� ū ��� ����Ʈ�� h�� �߰�
        	if(index<=answer) {list.add(index); answer=0;}
        	// h�� ���� �ο�Ƚ������ ū ��� ����
        	else {break;}
        }
        // list���� ���� ū ���� answer�� ���� 
        answer = (Integer) list.get(list.size()-1);
        return answer;
    }
}
