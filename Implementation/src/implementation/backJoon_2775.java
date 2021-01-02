package implementation;

import java.util.Scanner;

public class backJoon_2775 {
	
	
public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		int test = input.nextInt();
		 
		int _floor = 0,_room=1;
		int j=0;
		int count=0;
		
		while(test>0) {
			
			int floor = input.nextInt();
			int room = input.nextInt();
			int[] result = new int[room];
			int num=1;
			
			
			for(int i=0;i<room;i++) { 
				result[i]=num;
				num++;
			}
			
			while(_floor<floor) {
				
				int[] _result = new int[room];
				_result[0]=1;
				
				while(_room<room) {
					
					while(j<=_room) {
						
						_result[_room]+=result[j];
						j++;
					}
					
					j=0; _room++;
				}
				for(int k=0;k<room;k++) {
					result[k]=_result[k];
				}
				_room=1;
				_floor++;
				
			}
			
			count = result[room-1];
			System.out.println(count);
			_floor=0;
			test--;
		}
	}

}
