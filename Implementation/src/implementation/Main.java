package backJoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt(); // 고정비용
		long B = sc.nextInt(); // 가변비용
		long C = sc.nextInt(); // 노트북 가격 
		
		// 손익분기점 즉 최초로 이익이 발생하는 판매량을 출력한다. 
		// 손익분기점이 존재하지 않으면 -1을 출력한다.
		
		// 총 수입이 총 비용보다 많아져 이익이 발생하는 지점을 손익분기점이라고 한다. 

		// B의 비용이 C보다 크면 -1이다. 아무리 크기를 키워도 따라 잡을수없다. 

		if(B>=C) {
			System.out.println("-1");
		}
		else {
			long avg = A/(C-B);
			System.out.println(avg+1);
		}
		
		
	}

}
