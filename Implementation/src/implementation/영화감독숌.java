package backJoon;

import java.util.Scanner;

public class ¿µÈ­°¨µ¶¼ò {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int min = 666; int cnt = 1;
		
		while(true) {
			
			if(cnt==N+1) {
				System.out.println(min-1);
				break;
			}
			else if(String.valueOf(min).contains("666")) {
				cnt++;
			}
			
			min = min+1;
		}
	}

}
