package implementation;

import java.util.Scanner;

public class backJoon_5532 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int L = sc.nextInt(); // ��������
		int A = sc.nextInt(); // Ǯ����ϴ� ���� ��������
		int B = sc.nextInt(); // Ǯ����ϴ� ���� �� ������
		int C = sc.nextInt(); // ����̰� �Ϸ翡 Ǯ���ִ� �ִ� ����������
		int D = sc.nextInt(); // ����̰� �Ϸ翡 Ǯ���ִ� �ִ� ����������
		
		
		int Korean = A/C; int KoreanRest = A%C;
		int Math = B/D; int MathRest = B%D;
		
		if(KoreanRest!=0) { Korean+=1;}
		if(MathRest!=0) { Math+=1;}
		
		int result = java.lang.Math.max(Korean,Math);
		System.out.println(L-result);
		
		
	}

}
