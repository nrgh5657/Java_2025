package Practice;

import java.util.Scanner;

public class While예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int money = 0;
		boolean run = true;
		while(run) {
			System.out.println("---------------------------");
			System.out.println("1. 예금 | 2. 출금 3. 잔고 | 4. 종료");
			System.out.println("---------------------------");
			System.out.print("선택> \n");
		int num = Integer.parseInt(sc.nextLine());
		if(num == 1) {
			System.out.println("예금액> ");
			money += Integer.parseInt(sc.nextLine());
		}else if(num==2) {
			System.out.println("출금액> " );
			money-= Integer.parseInt(sc.nextLine());
		}else if(num==3) {
			System.out.print("잔고 > "  + money);
		}else if(num==4) {
			break;
		}
		
		
		}
		System.out.println("프로그램 종료");
		
	}

}
