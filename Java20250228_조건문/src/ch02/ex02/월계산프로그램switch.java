package ch02.ex02;

import java.util.Scanner;

public class 월계산프로그램switch {

	public static void main(String[] args) {

	/*	12월, 1월 2월 : 겨울
	 *  3월 4월 5월 : 봄
	 *  6월 7월 8월 : 여름
	 *  9월 10월 11월 : 가을
	 */
	
  Scanner sc = new Scanner(System.in);
  System.out.printf("월 입력: ");

  String strA = sc.nextLine();
  int month = Integer.parseInt(strA);

  switch(month) {
  case 12, 1, 2 -> {
	  System.out.println("겨울");
  }
  case 3, 4, 5 ->{
	  System.out.println("봄");
  }
  case 6, 7, 8 ->{
	  System.out.println("여름");
  }
  case 9, 10, 11->{
	  System.out.println("가을");
  }
  default -> {
	  System.out.println("다시 입력해주세요");
  }
  }
		
		
		
	}

}
