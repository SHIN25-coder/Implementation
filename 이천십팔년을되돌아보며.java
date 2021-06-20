package backJoon;

import java.util.Arrays;
import java.util.Scanner;

public class 이천십팔년을되돌아보며 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String num = sc.next();
		
		int count = 0;
		
		int array[] = new int[5];
		
		for(int i=0;i<num.length();i++) {
			
			char index = num.charAt(i);
			count=0;
			
			if(index=='2') { array[0] += ++count;}
			
			else if(index=='0') {array[1] += ++count;}
			else if(index=='1') {array[2] += ++count;}
			else if(index=='8') {array[3] += ++count;}
			
			else {
				array[4] += ++count;
				break;
			}
		}
				
		if(array[4]!=0) {
			System.out.println(0);
		}
		else {
			
			int result = 1;

			for(int i=0;i<array.length-1;i++) {

				if(array[i]==0){
					result = 1;
					break;
				}
				else {
					result = 0;
				}
				
			}
			
			if(array[0]==array[1]&&array[1]==array[2]&&array[2]==array[3]) {
				System.out.println(8);
			}
			else if(result==1){
				System.out.println(1);
			}
			else {
				System.out.println(2);
			}
		}
		
	}

}
