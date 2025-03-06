package ch01.ex02;

/*
 * 
 * 
 * 함수 2개 생성
 * 매개변수로 100 정수값을 전달하면
 * 함수 1은 1~100사이 홀수 값 합을 리턴
 * 함수 2는 1~100사이 짝수 값 합을 리턴
 * 메인함수에서 두 값을 호출하고, 각 전달받은 값을 출력한다.
 */

public class FunctionExam01 {

	public static void main(String[] args) {
	int number =100;
	
	int oddResult1 = func1(number);	
	int evenResult2 = func2(number);	
	
	System.out.println("홀수합 : " + oddResult1);
	System.out.println("짝수합 : " + evenResult2);
	}
	public static int func1(int number) {
		int sum = 0;
		for(int i=0; i<number; i++)
			if(i%2 ==1) {
			 sum += i;;
			
			 }
		return sum;
	
	}
	public static int func2(int number) {
		int sum =0;
		for(int i = 0; i<=number; i++) {
			if (i%2==0) {
				sum += i;
				
			}
		}
		return sum;
			
		
	}
}
