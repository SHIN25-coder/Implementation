package implementation;

import java.util.Scanner;

public class backJoon_2869 {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		long A = input.nextInt(); // 올라가는 길이
		long B = input.nextInt(); //내려오는 길이
		long V = input.nextInt(); //트리의 높이 
	
		long k =(V-A)/(A-B);
		
		if((V-A)%(A-B)==0) {
			k++;
			System.out.println(k);
		}
		
		else if((V-A)%(A-B)!=0) {
			k = k+2;
			System.out.println(k);
		}
		
	}

}
