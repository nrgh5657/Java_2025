package ch02.ex02;

import java.util.Scanner;

public class 월계산프로그램if {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("월 입력>> ");
		int month  = sc.nextInt();
		
		String result = " ";
		
		if (month==12 || month == 1 || month ==2) {
			result = "겨울";
		} else if (month==3 || month == 4 || month ==5) {
			result = "봄";
		} else if (month==6 || month == 7 || month ==8) {
			result = "여름";
		} else if (month==9 || month == 10 || month ==11) {
			result = "가을";
		}

		System.out.printf("입력된 %d월은 %s입니다\n", month, result);
	}

}
