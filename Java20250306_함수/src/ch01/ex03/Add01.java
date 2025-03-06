package ch01.ex03;

public class Add01 {
/*
 * 
 * 2개 값을 입력 받아서, 더하는 기능을 수행
 * 매개 변수 x, 반환 x 
 * 
 * 
 */
	public static void main(String[] args) {
		System.out.println("main 함수 시작");
		
		add();
		
		System.out.println("프로그램 종료");
		
	}
	public static void add() {
		System.out.println("add() 시작");
		int num1 = (int)(Math.random()*100)+1;
		int num2 = (int)(Math.random()*100)+1;
		
		System.out.println(num1 + " + " + num2 + " = " + (num1+num2) );
		
	}
}
