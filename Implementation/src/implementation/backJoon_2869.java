package implementation;

import java.util.Scanner;

public class backJoon_2869 {
	
	public static void main(String[]args) {
		
		Scanner input = new Scanner(System.in);
		
		long A = input.nextInt(); // �ö󰡴� ����
		long B = input.nextInt(); //�������� ����
		long V = input.nextInt(); //Ʈ���� ���� 
	
		long k =(V-A)/(A-B);
		
		if((V-A)%(A-B)==0) {
			k++;
			System.out.println(k);
		}
		
		else if((V-A)%(A-B)!=0) {
			k = k+2;
			System.out.println(k);
		}
		
	}

}
