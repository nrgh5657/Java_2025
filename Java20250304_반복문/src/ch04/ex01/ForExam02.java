package ch04.ex01;

public class ForExam02 {

	public static void main(String[] args) {

		/*
		 * 	반복문
		 *	for, while -> 조건을 만족하는 순간까지 계속 반복
		 *	for -> 반복 횟수를 알때
		 *  while -> 몇번 반복하는지 모를 때
		 *  do, while -> 조건을 만족하는 순간까지 계속 반복(단, 최소 1회는 보장)
		 */
		
		
		int sum = 0;
		
		for(int i =0; i<=100; i++){
			if(i%2 == 1) {
			sum = sum + i;
				
			}
		}

		System.out.println("sum : " + sum);
	}

}
