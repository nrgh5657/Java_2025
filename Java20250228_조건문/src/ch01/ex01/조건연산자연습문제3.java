package ch01.ex01;

import java.util.Scanner;

public class 조건연산자연습문제3 {

	public static void main(String[] args) {
 /*
  *  키보드 통해서 국어 점수, 영어점수 입력 
  *  국어점수, 영어점수 둘다 70이상이면 합격, 아니면 불합격
  *
  */
	
		
		Scanner sc	= new Scanner(System.in);
		
		System.out.printf("국어 점수: ");
		String strA = sc.nextLine();
		int kor = Integer.parseInt(strA);
		
		System.out.printf("영어 점수: ");
		String strB = sc.nextLine();
		int eng = Integer.parseInt(strB);

		String result = (kor>=70) && (eng>=70)? "합격" : "불합격"; 
		System.out.println(result + "입니다");
	
		
		
		
	}

	
}
