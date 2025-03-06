package ch01.ex03;

public class 함수오버로딩 {

	public static void main(String[] args) {
		functionA(10.0);
		
		//함수 이름 동일, 매개 변수 다르게 -> 같은 함수를 여러개 사용 가능 -> 함수 오버로딩
	}
	public static void functionA() {
		System.out.println("functionA()");
	}
	public static void functionA(int A) {
		System.out.println("void fountcionA(int n)");
	}
	public static void functionA(double n) {	
		System.out.println("void fountcionA(double n)");
	}
	public static void functionA(int n1, int n2) {
		System.out.println("void fountcionA(int n1, int n2)");
		
	}
	
}
