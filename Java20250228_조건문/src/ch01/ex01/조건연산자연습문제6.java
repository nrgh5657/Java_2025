package ch01.ex01;

import java.util.Scanner;

public class 조건연산자연습문제6 {

	public static void main(String[] args) {
 /*
  *  키보드 통해서 국어 점수 입력 받는다
  *  국어점수
  *  80이상이면 상
  *  60이상 중
  *  59이하면 하
  *
  */
	
		// if else 조건문
		Scanner sc	= new Scanner(System.in);
		
		System.out.printf("국어 점수: ");
		String strA = sc.nextLine();
		int kor = Integer.parseInt(strA);

		if(kor>=80) {
			System.out.println("상");
			} else if(kor>=60) {
				System.out.println( "중");
			} else {
				System.out.println("하");
			}

	}
}