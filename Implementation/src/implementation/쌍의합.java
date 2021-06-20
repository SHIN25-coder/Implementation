package backJoon;

import java.util.Scanner;

public class 쌍의합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int count = 0;
		
		/* 합이 n이 되는 두 자연수의 쌍을 찾는 프로그램을 작성
			첫 번째 수가 두 번째 수 보다 작아야한다.
			출력하는 쌍은 항상 사전순으로 출력 
		*/
		for(int i=0;i<N;i++) {
			int num = sc.nextInt();
			count = 0;
			System.out.print("Pairs for "+num+":");
			for(int j=1;j<=num/2;j++) {
				int value = num-j;
				if(j==value) 
				{
					continue;
				}
				else {
					if(count>=1) {
						System.out.print(","+" "+j+" "+value);
					}
					else {
						System.out.print(" "+j+" "+value);
						count++;
					}
				}
			}
			System.out.println();
		}
	}

}
