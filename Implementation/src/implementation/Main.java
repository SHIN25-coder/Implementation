package backJoon;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long A = sc.nextInt(); // �������
		long B = sc.nextInt(); // �������
		long C = sc.nextInt(); // ��Ʈ�� ���� 
		
		// ���ͺб��� �� ���ʷ� ������ �߻��ϴ� �Ǹŷ��� ����Ѵ�. 
		// ���ͺб����� �������� ������ -1�� ����Ѵ�.
		
		// �� ������ �� ��뺸�� ������ ������ �߻��ϴ� ������ ���ͺб����̶�� �Ѵ�. 

		// B�� ����� C���� ũ�� -1�̴�. �ƹ��� ũ�⸦ Ű���� ���� ����������. 

		if(B>=C) {
			System.out.println("-1");
		}
		else {
			long avg = A/(C-B);
			System.out.println(avg+1);
		}
		
		
	}

}
