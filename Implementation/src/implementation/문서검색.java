package backJoon;

import java.util.Scanner;

public class �����˻� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		
		int cnt = 0; String result = ""; int tmp = 0;
		
		if(a.equals(b)) {
			//a���ڿ��� b���ڿ��� ������ ��� 
			cnt++;
		}
		else {
			
			for(int i=0;i<a.length();i++) {
				
				if(result.equals(b)) {
					// �ӽ� ���ڿ��� b�� ������ ��� 
					cnt++; i += tmp;
					result = "";
				}
				if(i>a.length()-1) {
					// ���ڿ� ������ �ʰ��ϴ� ��� 
					break;
				}
				if((a.charAt(i)==b.charAt(0))) {
					// ù��° ��¥�� ���� ���
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
