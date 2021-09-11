package backJoon;

import java.util.ArrayList;
import java.util.Scanner;

public class 그룹단어체커{
	
	static boolean result = false;
	static int count = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] str = new String[N];
		ArrayList<Character> list = new ArrayList<Character>();
		
		
		for(int i=0;i<str.length;i++) {
			str[i] = sc.next();
		}
		
		for(int i=0;i<str.length;i++) {
			
			String s = str[i];
			
			list = new ArrayList<Character>();
			
			for(int j=0;j<s.length();j++) {
				
				if(list.size()!=0&&list.contains(s.charAt(j))&&s.charAt(j)!=list.get(j-1)) {
					result = true;
					break;
				}
				else {
					list.add(s.charAt(j));
				}
			}
			if(result==false) {count++;}
			else { result = false;}
		}
		
		System.out.println(count);
	}

}
