package implementation;

import java.util.Scanner;

public class backJoon_2884 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int H = sc.nextInt();
		int M = sc.nextInt();	
		
		// 45ºÐ ÀÏÂï ¾Ë¶÷ ¼³Á¤ÇÏ±â 
		if(60+M>=105) {
			//H = H-1;
			M = M-45;
		}
		else if(60+M<105) {
			
			H = H-1;  M = (60+M)-45;
			
			if(M==60) M = 0;
			if(H==-1) H = 23;
		}
		
		System.out.print(H+" "+M);
		
	}

}
