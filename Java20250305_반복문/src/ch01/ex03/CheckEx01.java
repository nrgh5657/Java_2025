package ch01.ex03;

import java.util.Scanner;

public class CheckEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int balance = 0;
		boolean flag = true;
		while(flag) {
			System.out.println("---------------------------");
			System.out.println("1.예금 |2. 출금 | 3.잔고 | 4. 종료");
			System.out.println("---------------------------");
			System.out.print("선택> ");
		
		int num = Integer.parseInt(sc.nextLine());
		switch(num) {
		case 1:
		 System.out.print("예금액> ");
		 balance += Integer.parseInt(sc.nextLine());
		 break;
		case 2:
		 System.out.print("출금액> ");
		 balance -= Integer.parseInt(sc.nextLine());
		 break;
		case 3:
		 System.out.print("잔고> ");
		 System.out.println(balance);
		 break;
		case 4:
		flag = false; 
		break;
		}
     	System.out.println();
		}
			System.out.println("프로그램 종료");
		
	}

}
