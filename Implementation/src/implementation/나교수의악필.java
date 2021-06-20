package backJoon;

import java.util.Scanner;

public class 나교수의악필 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		double num = 0;

		for(int i=0;i<N;i++) {
			String s = sc.next();
			for(int j=0;;j++) {
				if(Integer.parseInt(s)>=100) {
					num += Integer.parseInt(s);
					break;
				}
				else if(!s.contains("6")&&!s.contains("0")){
					num += Integer.parseInt(s);
					break;
				}
				else if(s.charAt(j)=='6'||s.charAt(j)=='9'||s.charAt(j)=='0') {
					char newc = s.charAt(j);
					s = s.replace(s.charAt(j),'9');
				}
				
			}
		}
		
		System.out.println(Math.round(num/N));
		
	}

}
