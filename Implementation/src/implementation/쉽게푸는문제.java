package backJoon;

import java.util.Scanner;

public class ����Ǫ�¹��� {
	
	static int result = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// ������ ���۰� ���� ��Ÿ���� ���� A,B
		int A = sc.nextInt(); // ���� 
		int B = sc.nextInt(); // ��
		
		int i =1; int sum = 0;

		while(sum<B) { // ������ ����ɶ����� ������.  
				
			for(int j=0;j<i;j++) {
				
				if(sum==B) { // �������� 
					break;
				}
				if(sum>=A-1) { // ������ ���� 
					result += i ;
					sum++;
				}
				else { // ������ ������ 
					sum++;
				}
			}
			i++;
			
		}
		
		System.out.println(result);
	}

}
