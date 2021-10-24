package backJoon;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class 베스트셀러 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 오늘 하루 동인 팔린 책의 개수 
	
		TreeMap<String,Integer> map = new TreeMap<String,Integer>();
		
		for(int i=0;i<N;i++) {
			String s = sc.next();
			if(map.containsKey(s)) {
				int num = map.get(s);
				map.put(s,++num);
			}
			else {
				map.put(s,1);
			}
		}
		
		Iterator<Entry<String,Integer>> entries = map.entrySet().iterator();
		
		int max = 1; String temp = map.firstKey();
		
		while(entries.hasNext()) {
			
			Map.Entry<String,Integer> entry = entries.next();
		
			if(max<entry.getValue()) {
				max = entry.getValue();
				temp = entry.getKey();
			}
			
		}
		
		System.out.println(temp);
		
		
		
	}

}
