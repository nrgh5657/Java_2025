package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열05 {

	public static void main(String[] args) {
	//7명 점수 입력 받아서, 총점 평균을 구하기	
		//예시 int num = 0;
		int[]score = new int [] {-1,-3,-700,1, 2 ,9, 3};
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
		
		for(int i=0; i<7; i++) {
			if(max < score[i]){
				max = score[i];
				}
			if(min>score[i]) {
				min = score[i];
			}

	}
		
		System.out.println("최댓값: " + max);
		System.out.println("최솟값: " + min);
	
	
	System.out.println("----------------------------");
	/*
	 * {-1, -3, -700 ,1 ,2 ,9 ,3
	 * 1 입력, 출력 :1값은 4번째 위치 입니다
	 * -3 입력, 출력 : -3값은 2번째 위치입니다
	 * 
	 * 
	 * 
	 */
	
	Scanner sc = new Scanner(System.in);
	System.out.printf("찾을 숫자 입력: ");
	
    int index = -1;	
	int numA= sc.nextInt();
	for(int i = 0; i<7; i++) {
		if(numA == score[i]) {
			index = i;
		}
	}
	if(index != -1)
	System.out.printf("%d값은 %d번째 위치입니다\n", numA, index+1);
	else
	System.out.printf("%d값을 찾을수 없습니다\n", numA);
	System.out.println("---------------------");
	
	/*-1, -3, -700, 1 2 9 3
	 * 정렬해서 출력하기....(-700,-3,1,2,3,9,10)
	 *
	 *
	 * 
	 */
	 
	
	
	
	}
	
	

}
