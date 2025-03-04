package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열04 {

	public static void main(String[] args) {
	//7명 점수 입력 받아서, 총점 평균을 구하기	
		Scanner sc = new Scanner(System.in);
		int[]score = new int [7];
		int sum = 0;
		for(int i = 0; i<7; i++) {
			System.out.printf(i+1+"번학생 점수: ");
			score [i] = sc.nextInt();
			sum += score [i];
		}
		double average = sum/7.0;
		
		System.out.printf("총 점수: %d, 평균 점수: %.2f\n", sum , average);
	}
	

}
