package ch01.ex02;

public class DoWhile01 {

	public static void main(String[] args) {

		int sum3 = 0;
		int j = 1000; //초기값
		do {
			j++;  // 증가, 변동값
			sum3 += j;
		}while(j<100); // 조건
		System.out.println(sum3);
		
	}

}
