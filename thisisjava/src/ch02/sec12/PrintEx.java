package ch02.sec12;

public class PrintEx {

	public static void main(String[] args) {

		int value = 123;
		System.out.printf("상품의 가격:%d원\n", value);   // 정수
		System.out.printf("상품의 가격:%6d원\n", value);  // 정수 왼쪽 6자리 공백
		System.out.printf("상품의 가격:%-6d원\n", value); // 정수 오른쪽 6자리 공백
		System.out.printf("상품의 가격:%06d원\n", value); // 정수 왼쪽 빈자리 0 채움
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이:%10.3f\n", 10, area);
							// 정수 7자리, 소수점, 소수점 3자리, 왼쪽 빈자리 공백 
		String name = "홍길동";
		String job = "도적";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
                     // 정수 왼쪽6자리 공백 | 10자리 문자열 오른쪽 빈자리 공백 | 10자리 문자열 왼쪽 빈자리 공백 		
		
		
		// %d 정수   %s 문자  %f 실수

		System.out.printf("이름 : %1s, 나이 : %2s", "김자바", 25 );
		//문자열이 두개 이상일 경우 갑의 순번을 포함
	}

}
