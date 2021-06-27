package backJoon;

import java.util.Scanner;

public class »ïÀÇ¹è¼ö {

	static int count = 0;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String X = sc.next();
		
		String YESORNO = calculate(X,0,0);
		System.out.println(count);
		System.out.println(YESORNO);
	}
	
	public static String calculate(String X,long i,long result) {
		
		if(X.equals("3")||X.equals("6")||X.equals("9")) {
			return "YES";
		}
		else if(X.length()==1) {
			return "NO";
		}
		else if(i==X.length()) {
			count++;
			return calculate(String.valueOf(result),0,0);
		}
		else {
			result += (int)X.charAt((int) i)-'0';
			return calculate(X,i+1,result);
		}
		
	}
	

}
