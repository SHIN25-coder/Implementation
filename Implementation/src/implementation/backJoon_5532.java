package implementation;

import java.util.Scanner;

public class backJoon_5532 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt(); // 방학총일
		int A = sc.nextInt(); // 풀어야하는 국어 총페이지
		int B = sc.nextInt(); // 풀어야하는 수학 총 페이지
		int C = sc.nextInt(); // 상근이가 하루에 풀수있는 최대 국어페이지
		int D = sc.nextInt(); // 상근이가 하루에 풀수있는 최대 수학페이지
		
		
		int Korean = A/C; int KoreanRest = A%C;
		int Math = B/D; int MathRest = B%D;
		
		if(KoreanRest!=0) { Korean+=1;}
		if(MathRest!=0) { Math+=1;}
		
		int result = java.lang.Math.max(Korean,Math);
		System.out.println(L-result);
		
		
	}

}
