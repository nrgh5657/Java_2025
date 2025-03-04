package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열06 {

	public static void main(String[] args) {
	//7명 점수 입력 받아서, 총점 평균을 구하기	
		Scanner sc = new Scanner(System.in);
		//예시 int num = 0;
		int[]score = new int [] {60,100,70,90,50,20,40};
		int sum = 0;
		double average = 0;
		int max = 0;
		int min = 100;
		for(int i = 0; i<7; i++) {
			sum += score [i];
			
		}
		average = sum/7.0;
		
		System.out.printf("총 점수: %d, 평균 점수: %.2f\n", sum , average);
		System.out.println("7번째 값 출력 :  " + score[6]  );
		System.out.println("------------------------");
	
		for(int i = 0; i<7; i++) {	
			max= (int)(Math.max(max, score[i]));
		}
		for(int i = 0; i<7; i++) {	
			min =(int)(Math.min(min, score[i]));
		}
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
	}
	

}
