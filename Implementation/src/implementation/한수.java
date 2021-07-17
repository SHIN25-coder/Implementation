package backJoon;

import java.util.Scanner;

public class ÇÑ¼ö {
	
	static int result = 99;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String num = sc.next();

		boolean judge = false;

		if(Integer.parseInt(num)<100) {
			System.out.println(num);
		}
		else {
		
			int _start = 100;
			
			while(_start<=Integer.parseInt(num)) {
				
				String start = String.valueOf(_start);
				String[] array = start.split("");
			
				int diff = Integer.parseInt(array[0])-Integer.parseInt(array[1]);
			
				for(int i=1;i<array.length&&i+1!=array.length;i++) {
					
					if(Integer.parseInt(array[i])-Integer.parseInt(array[i+1])!=diff) {
						judge =  true;
						break;
					}
					else {
						judge =  false;
					}
				}
			
				if(judge ==false) {
					result++;
				}
				_start++;
		}
			
			System.out.println(result);
	
		}
		
	}

}
