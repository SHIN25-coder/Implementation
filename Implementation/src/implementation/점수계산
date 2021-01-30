package implementation;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class backJoon_2506 {
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //¨ù¡¾¨ú©£
		int i = Integer.parseInt(bf.readLine()); //Int
		String s = bf.readLine(); //String
		
		String[] array = new String[i];
		array = s.split(" ");
		
		int result=0;
		int count = 0;
		
		for(int j=0;j<array.length;j++) {
			
			if(Integer.valueOf(array[j]).equals(0)) {
				result += Integer.valueOf(array[j]);
				count = 0;
			}
			else if(Integer.valueOf(array[j])>=1) {
				
				result += Integer.valueOf(array[j])+count;
				count++;
			}
		
		}
		System.out.println(result);
	}

}
