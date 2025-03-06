package ch01.ex01;

public class 함수매개변수있고반환값없는경우02 {
	/*
	 * 합수
	 * 입력(매개변수)    출력(반환값)
	 * 		O			 O
	 * 		O			 X
	 * 		X			 O
	 *		X			 X	
	 *
	 *	함수 정의 -> 함수 만드는 것
	 * 	함수 호출 -> 만든 함수를 실행하는 것
	 *
	 */		
	
	
	public static void main(String[] args) {
		sum(10, 20, 10.2); //함수 호출
	//      인자
		System.out.println("프로그램 종료!!");
	}
	// 함수 정의
	public static void sum(int num1, int num2, double dnum) {
	// 						 매개변수
		//코드 구현
		System.out.println("void sum()함수 호출 !!");
		System.out.println(num1 + num2 + dnum);
		//void 함수 return 없어도 가능
	}
	

}
