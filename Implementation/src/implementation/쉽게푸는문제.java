package backJoon;

import java.util.Scanner;

public class 쉽게푸는문제 {
	
	static int result = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// 구간의 시작과 끝을 나타내는 정수 A,B
		int A = sc.nextInt(); // 시작 
		int B = sc.nextInt(); // 끝
		
		int i =1; int sum = 0;

		while(sum<B) { // 구간이 종료될때까지 돌린다.  
				
			for(int j=0;j<i;j++) {
				
				if(sum==B) { // 구간종료 
					break;
				}
				if(sum>=A-1) { // 구간에 들어가면 
					result += i ;
					sum++;
				}
				else { // 구간에 들어가기전 
					sum++;
				}
			}
			i++;
			
		}
		
		System.out.println(result);
	}

}
