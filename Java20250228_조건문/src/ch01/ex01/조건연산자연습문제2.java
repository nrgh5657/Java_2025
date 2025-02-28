package ch01.ex01;

import java.util.Scanner;

public class 조건연산자연습문제2 {

	public static void main(String[] args) {
 /*
  *  키보드 통해서 국어 점수 입력 받는다
  *  70이상이면 합격 출력, 70미만이면 불합격 메시지 출력
  *
  */
	
		// if else 조건문
		Scanner sc	= new Scanner(System.in);
		
		System.out.printf("점수 입력: ");
		String strA = sc.nextLine();
		int score = Integer.parseInt(strA);
		
		if(score>=70) {
			System.out.println("합격 입니다");
		}
	
		
		else {
			System.out.println("불합격 입니다");
		
	}

	}
}