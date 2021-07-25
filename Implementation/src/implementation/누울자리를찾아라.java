package backJoon;

import java.util.Scanner;

public class 누울자리를찾아라 {
	
	static String[] row;
	static String[] column;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		row = new String[N];
		column = new String[N];
		String tempStr = ""; int count = 0; int num = 0; 
		
		sc.nextLine();
		
		for(int i=0;i<N;i++) {
			row[i] = sc.nextLine();
		}
		
		// 세로 
		while(true) {
			
			if(num==N) {
				break;
			}
			if(count==N) {
				column[num] = tempStr;
				num++; count = 0; tempStr="";
			}
			else {
				tempStr+=row[count].charAt(num);
				count++;
			}
		}

		System.out.println(cntfunction(row,"",0)+" "+cntfunction(column,"",0));
		
	}
	
	public static int cntfunction(String[] s,String tempStr,int cnt) {
		
		for(int i=0;i<s.length;i++) {
			String temp = s[i];
			for(int j=0;j<temp.length();j++) {
				
				if(temp.charAt(j)=='.') {
					tempStr+='.';
				}
				else if(tempStr.length()<2&&temp.charAt(j)=='X') {
					tempStr="";
				}
				else {
					cnt++;
					tempStr="";
				}
			}
			if(tempStr.contains("..")) {cnt++;}
			tempStr = "";
		}
		
		return cnt;
	}
	
	}
