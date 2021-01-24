package programmers;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		String[] phonebook = str.split(" ");
		
		/* � ��ȣ�� �ٸ� ��ȣ�� ���ξ��� ��찡 ������ false
 		�׷��� �ʴٸ� true�� ��ȯ*/
		
		Solution s = new Solution();
		System.out.println(s.solution(phonebook));
		
	}

}


class Solution {
    public boolean solution(String[] phone_book) {
       
    	boolean answer = true;
        
        for(int i=0;i<phone_book.length;i++) {
        	
        	String cone = phone_book[i];
        	
        	for(int j=i+1;j<phone_book.length;j++) {

        		if(phone_book[j].startsWith(cone)||cone.startsWith(phone_book[j])) {
        			answer = false;
        			break;
        		}
        	}
        	
        	if(answer==false) {break;}
        }
        return answer;
    }
}
