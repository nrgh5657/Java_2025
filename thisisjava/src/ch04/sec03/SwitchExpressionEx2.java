package ch04.sec03;

import java.util.Scanner;

public class SwitchExpressionEx2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.printf("입력: ");
		String grade = sc.nextLine();
		 
		
		switch(grade) {
		case "A", "a"->{
			System.out.println("우수 회원입니다.");
			break;}
		
		case "B", "b"->{
			System.out.println("일반 회원입니다.");
			break;}
		
		default->{
			System.out.println("손님입니다.");
		}
	 }
		
		
	}

}
