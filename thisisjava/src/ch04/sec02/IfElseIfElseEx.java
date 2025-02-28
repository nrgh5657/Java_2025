package ch04.sec02;

import java.util.Scanner;

public class IfElseIfElseEx {

	public static void main(String[] args) {

		Scanner sc	= new Scanner(System.in);
	
		System.out.printf("점수 입력: ");
		String strA = sc.nextLine();
		int score = Integer.parseInt(strA);
		
		if(score>=90) {
			System.out.println("점수가 100~90입니다");
			System.out.println("등급은 A입니다");
		}
		else if(score >= 80) {
			System.out.println("점수가 80~89입니다");
			System.out.println("등급은 B입니다");
		}
		else if(score >=70) {
			System.out.println("점수가 70~89입니다");
			System.out.println("등급은 C입니다");
		}
		
		else {
			System.out.println("점수가 70 미안입니다");
			System.out.println("등급은 D입니다");
			
		}
	}

}
