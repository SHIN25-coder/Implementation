package backJoon;

import java.util.Arrays;
import java.util.Scanner;

public class 성적통계 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		
		int[][] result = new int[K][3];
		int[] array; int max = 0;
		
		for(int i=0;i<K;i++) {
			
			int N = sc.nextInt();
			array = new int[N]; max = 0;
			
			for(int j=0;j<N;j++) {
				array[j] = sc.nextInt();
			}
			
			Arrays.sort(array);
			
			for(int j=0;j<N&&j+1<N;j++) {
				int temp = array[j+1]-array[j];
				if(max<=temp) {
					max = temp;
				}
			}
			
			result[i][0] = array[array.length-1];
			result[i][1] = array[0];
			result[i][2] = max;
			
		}
		
		for(int i=0;i<K&&i+1<=K;i++) {
			System.out.println("Class "+(i+1));
			System.out.println("Max "+result[i][0]+", "+"Min "+result[i][1]+", "+"Largest gap "+result[i][2]);
		}
	}

}
