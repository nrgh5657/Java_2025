package ch01.ex05;

import java.util.Scanner;

public class Exam_문제1 {

	public static void main(String[] args) {
		/*
		 *  키보드 통해서 4000을 입력 받은후 
		 *  시분초를 구하는 프로그램 구현
		 *  입력 : 4000
		 *  출력 : 1시간 6분 40초
		 */
	Scanner sc = new Scanner(System.in);
	
	System.out.printf("입력: ");
	String total= sc.nextLine();
	int A = Integer.parseInt(total);
	
	int hour = A/3600;
	int minute = (A%3600)/60;
	int second = (A%3600)%60;	
	System.out.println("총 " + A + "초");
	System.out.println("출력: " + hour + "시간 " + minute + "분 " + second + "초");
	
	}

}
