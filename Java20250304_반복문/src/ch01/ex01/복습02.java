package ch01.ex01;

import java.util.Scanner;

public class 복습02 {

	public static void main(String[] args) {
		/*
		 * 정수 : byte, short, char, int, long
		 * 실수 : float, double
		 * 논리 : boolean
		 */
		
		//객체 참조변수
		Scanner sc = new Scanner(System.in);
		System.out.printf("정수 입력: ");
		int number = sc.nextInt();
		
		String msg =(number>0) ? "양수" : ((number == 0)?  "zero" : "음수");
		System.out.println(msg);
		
		
		
		
		
		
		
	}

}
