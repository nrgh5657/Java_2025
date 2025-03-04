package ch01.ex01;

import java.util.Scanner;

public class 복습04 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.printf("정수 입력: ");
		int number = sc.nextInt();
		
		boolean check=false;
		String msg = "";
		
		if(number>0) 
			msg = "양수";
		else if (number==0) 
			msg = "제로";
		else 
			msg = "음수";
		
		System.out.println(msg);
		
		
	}

}
