package backJoon;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class ¼¿ÇÁ³Ñ¹ö{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int max = 10000;
		
		HashMap<Integer,Boolean> map = new HashMap<Integer,Boolean>();
		
		for(int i=1;i<max;i++) {
			map.put(i,false);
		}
		
		int temp = 0;
		
		for(int i=0;i<max;i++) {
			String num = String.valueOf(i);
			temp += Integer.parseInt(num);
			for(int j=0;j<num.length();j++) {
				temp += num.charAt(j)-'0';
			}
			if(map.containsKey(temp)&&map.get(temp)==false) {
				map.put(temp,true);
			}
			temp = 0;
		}
		
		
		Set<Entry<Integer, Boolean>> entrySet = map.entrySet();

		for(Entry<Integer,Boolean> entry:entrySet) {
			if(entry.getValue().equals(false)) {
				System.out.println(entry.getKey());
			}
		}

	}

}
