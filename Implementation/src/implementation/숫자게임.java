package backJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class 숫자게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[][] array = new int[N][5];
		
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<5;j++) {
				array[i][j] = sc.nextInt();
			}
		}
		
		int i=0; int j =0; int k = 1;
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		while(true) {
			
			if(k+1==5) {
				j++; k = j+1;
			}
			else if(j>5/2) {
				Collections.sort(list);
				result.add(list.get(list.size()-1));
				list = new ArrayList<Integer>();
				i++; j = 0; k = 1 ;
			}
			else if(i==N) {
				break;
			}
			else {
				
				int temp = array[i][j]+array[i][k];
				
				for(int t =k+1;t<5;t++) {
					temp += array[i][t];
					list.add(temp%10);
					temp -= array[i][t];
				}
				k++;
				
			}

		}
		
		int max = result.get(0);
		int temp = 1;
	
		for(int t = 1;t<result.size();t++) {
			if(max<=result.get(t)) {
				max = result.get(t);
				temp = t+1;
			}
		}
		
		System.out.println(temp);
		
		
	}

}
