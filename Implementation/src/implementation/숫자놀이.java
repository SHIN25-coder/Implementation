package backJoon;

import java.util.Arrays;
import java.util.Scanner;

public class 숫자놀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int M = sc.nextInt();
		int N = sc.nextInt();
		
		// M이상 N이하
		
		String[] tmp = {"one","two","three","four","five","six","seven","eight","nine","zero"};
		Character[] num = {'1','2','3','4','5','6','7','8','9','0'};
		String[] total = new String[N-M+1]; int cnt = 0;
		String[] result = new String[N-M+1];
		String temp = "";
		
		for(int i=M;i<=N;i++) {
			String s = String.valueOf(i);
			for(int j=0;j<s.length();j++) {
				char c = s.charAt(j);
				for(int k=0;k<num.length;k++) {
					if(c==num[k]) {temp+=tmp[k]+" ";}
				}
			}
			total[cnt++] = temp;
			temp = ""; 
		}
		
		Arrays.sort(total);
		
		for(int i=0;i<total.length;i++) {
			String[] str = total[i].split(" ");
			for(int j=0;j<str.length;j++) {
				String s = str[j];
				if(s.equals("one")) {temp+="1";}
				if(s.equals("two")) {temp+="2";}
				if(s.equals("three")) {temp+="3";}
				if(s.equals("four")) {temp+="4";}
				if(s.equals("five")) {temp+="5";}
				if(s.equals("six")) {temp+="6";}
				if(s.equals("seven")) {temp+="7";}
				if(s.equals("eight")) {temp+="8";}
				if(s.equals("nine")) {temp+="9";}
				if(s.equals("zero")) {temp+="0";}
			}
			result[i] = temp;
			temp = "";
		}
		
		for(int i=0;i<result.length;i++) {
			
			if(i%10==0&&i!=0) {
				System.out.println();
				System.out.print(result[i]+" ");
			}
			else {
				System.out.print(result[i]+" ");
			}
		}
	}

}
