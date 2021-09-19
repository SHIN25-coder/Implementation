package backJoon;

import java.math.BigInteger;
import java.util.Scanner;

public class 팩토리얼0의개수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		BigInteger N = sc.nextBigInteger();
		
		BigInteger temp = BigInteger.ONE;
		
		while(true) {
			
			if(N.equals(BigInteger.ZERO)) {
				break;
			}
			else {
				temp = temp.multiply(N);
				N = N.subtract(BigInteger.ONE);
			}
		}

		String result = String.valueOf(temp); int cnt = 0;
		
		for(int j=result.length()-1;j>=0;j--) {
			if(result.charAt(j)=='0') {
				cnt++;
			}
			else {
				break;
			}
		}

		System.out.println(cnt);
	}

}
