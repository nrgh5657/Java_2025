package ch04.ex01;

import java.util.Scanner;

public class ForExam03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.printf("정수 입력: ");
		int number = sc.nextInt();
		int sum = 0;
		int i;

		for(i =1; i<=number;i++) {
			if(i%2 == 1) //홀수합만 구하기
				sum +=i;
			
		}
		System.out.println("합: " + sum);
		
		sum = 0;
		for(i =1; i<=number;i=i+2) {
				sum +=i;
			
		}
		
		System.out.println("합: " + sum);
  }
}