package backJoon;

import java.util.Scanner;

public class 문서검색 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		int cnt = 0; String result = ""; int tmp = 0;
		
		if(a.equals(b)) {
			//a문자열과 b문자열이 동일한 경우 
			cnt++;
		}
		else {
			
			for(int i=0;i<a.length();i++) {
				
				if(result.equals(b)) {
					// 임시 문자열과 b가 동일한 경우 
					cnt++; i += tmp;
					result = "";
				}
				if(i>a.length()-1) {
					// 문자열 범위를 초과하는 경우 
					break;
				}
				if((a.charAt(i)==b.charAt(0))) {
					// 첫번째 글짜가 같은 경우
					int temp = i;
					result += b.charAt(0);
					
					for(int j=1;j<b.length();j++) {
						
						if(temp+j<a.length()&&a.charAt(temp+j)==b.charAt(j)) {
							result += b.charAt(j);
							tmp = j;
						}
						else {
							result = "";
							break;
						}
					}
					
					
				}
				
			}
			
			
		}
		
		if(result.equals(b)) {cnt++;}
		System.out.println(cnt);
	}

}
