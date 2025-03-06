package ch01.ex03;

import java.util.Scanner;

public class Add04 {
/*
 * 
 * 2개 값을 입력 받아서, 더하는 기능을 수행
 * 매개 변수 0, 반환 0 
 * 
 * 
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("main 함수 시작");
		int num1 = (int)(Math.random()*100)+1;
		int num2 = (int)(Math.random()*100)+1;
		
		int result = add(num1, num2);
		
		System.out.println(result);
		System.out.println("프로그램 종료");
		
	}
	public static int add(int numA, int numB) {
		System.out.println("add() 시작");
		
		System.out.println("numA= " + numA  + " numB= " + numB);
		int sum = numA + numB;
		return sum;
	}
}
