package implementation;

import java.util.Scanner;

public class backJoon_10250 {
	
public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		int testcase = sc.nextInt();
		int i=0;
		
		
		while(i<testcase) {
			
			int H = sc.nextInt(); //HÃþ °Ç¹° 
			int W = sc.nextInt(); //W°³ÀÇ ¹æ  
			int N = sc.nextInt(); //N¹øÂ° ¼Õ´Ô 
			
			if(N%H==0) {
				W = N/H;
			}
			else {
				W = (N/H)+1;
			}
			
			int count=0;
			int min = 1;
			String _key=null;
			
			while(true) {
			
				for(int j=1;j<=H;j++) {
					for(int k=1;k<=W;k++) {
					
						if(k==min) {
							count++;
							if(count==N) {
								if(k<10) {
								_key = j+"0"+k;
								}
								else {
								_key = j+""+k;
								}
								break;
							}
						}
				}
				if(count==N) {
					break;
				}
			}
			if(count==N) {
				System.out.println(_key);
				break;
			}
			min++;
			}
			i++;
		}
			
		}

}
