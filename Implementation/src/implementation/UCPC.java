package backJoon;

import java.util.Scanner;

public class UCPC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		// 첫번째 줄에 입력으로 주어진 문자열을 적절히 축약해 "UCPC"로 만들 수 있으면
		// I love UCPC를 출력하고 만들 수 없으면 I hate UCPC를 출력 
		
		String[] array = s.split(" ");
		boolean[] judge = new boolean[4];

		for(int i=0;i<array.length;i++) {
			String temp = array[i];
			for(int j=0;j<temp.length();j++) {
				if(temp.charAt(j)=='U') {
					judge[0] = true;
				}
				if(temp.charAt(j)=='C'&&judge[0]==true) {
					judge[1] = true;
				}
				if(temp.charAt(j)=='P'&&judge[1]==true) {
					judge[2] = true;
				}
				if(temp.charAt(j)=='C'&&judge[2]==true) {
					judge[3] = true;
				}
			}
	
		}
		
		int count = 0;
		
		for(int j=0;j<judge.length;j++) {
			if(judge[j]==false) {
				count++;
				break;
			}
		}
		
		if(count==1) {
			System.out.println("I hate UCPC");
		}
		else {
			System.out.println("I love UCPC");
		}
	}

}
