package backJoon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class 회사에있는사람 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		HashMap<String,String> map = new HashMap<String,String>();
		ArrayList<String> list = new ArrayList<String>();
		
		for(int i=0;i<N;i++) {
			map.put(sc.next(), sc.next());
		}
		
		Iterator<String> keys = map.keySet().iterator();
		
		while(keys.hasNext()) {
			
			String key = keys.next();
			
			if(map.get(key).equals("enter")) {
				list.add(key);
			}
			else {
				
			}
		}
		
		Collections.sort(list);
		
		for(int i=list.size()-1;i>=0;i--) {
			System.out.println(list.get(i));
		}
		}
	}

