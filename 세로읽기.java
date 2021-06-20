package backJoon;

import java.util.Scanner;

public class 세로읽기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char[][] array = new char[15][5];
		
		int k = 0;
		
		for(int i=0;i<5;i++) {
			String s = sc.next();
			for(int j=0;j<s.length();j++) {
				array[j][k] = s.charAt(j);
			}
			k++;
		}
		
		String result = "";
		int count=0;
		
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<5;j++) {
				if((int)array[i][j]==0) 
				{
					result+="";
					count++;
				}
				else if(count==5) {
					break;
				}
				else {
					result += array[i][j];
					count=0;
				}
			}
			if(count==5) {break;}
		}
		
		System.out.println(result);
	}

}
