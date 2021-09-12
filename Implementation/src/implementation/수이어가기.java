package backJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class 수이어가기 {
	
	static int first = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		first = sc.nextInt();
		
		int tmp = first/2;
		int N = first;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		int count = 1; int total = 0; int i=0; int max = 1;
	
		list.add(first); list.add(tmp);
		
		while(true) {
			
			if(total<0) {
				
				if(max<=count) { // 최댓값 찾기 
					max = count;
					i++; count = 1;
					tmp = (first/2)+i;
					N = first;
					result = list;
					list = new ArrayList<Integer>(); // 새롭게 생성 
					list.add(first); list.add(tmp);
				}
				else {
					break;
				}
			}
			
			total = N-tmp; // 전전에서 전에꺼 빼기 
			list.add(total);
			N = tmp;
			tmp = total;
			
			count++;
		}
		
		System.out.println(result.size()-1);
		
		for(int j=0;j<result.size()-1;j++) {
			System.out.print(result.get(j)+" ");
		}
	}

	
	

}
