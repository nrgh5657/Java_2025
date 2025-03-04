package ch04.ex01;

import java.util.Scanner;

public class ForExam04_배열연습 {

	public static void main(String[] args) {
		int[]score = new int[]{-1,-2,- 3 , 7, 8, 15, 6};
		Scanner sc = new Scanner(System.in);
		int index = -1;
		System.out.println("찾을 숫자를 입력: " );
		int numA = sc.nextInt();
		int i = 0;
		for(; i<7; i++) {
			if(numA == score[i]) {
				index = i;
				break;
			}
		}
		if(index != -1) {
			System.out.printf("%d 값은 %d번째 위치입니다\n", numA, index+1);
		}else
			System.out.printf("%d값은 찾을수 없습니다\n", numA);



 } 

}