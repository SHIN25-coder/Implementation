package backJoon;

import java.util.Scanner;

public class ������ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int count = 0;
		
		/* ���� n�� �Ǵ� �� �ڿ����� ���� ã�� ���α׷��� �ۼ�
			ù ��° ���� �� ��° �� ���� �۾ƾ��Ѵ�.
			����ϴ� ���� �׻� ���������� ��� 
		*/
		for(int i=0;i<N;i++) {
			int num = sc.nextInt();
			count = 0;
			System.out.print("Pairs for "+num+":");
			for(int j=1;j<=num/2;j++) {
				int value = num-j;
				if(j==value) 
				{
					continue;
				}
				else {
					if(count>=1) {
						System.out.print(","+" "+j+" "+value);
					}
					else {
						System.out.print(" "+j+" "+value);
						count++;
					}
				}
			}
			System.out.println();
		}
	}

}
