package ex07;

import java.util.Scanner;

public class SalaryExam {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("월 정보: " );
		int month = sc.nextInt();
		
		
		System.out.print("등급: ");
		int grade = sc.nextInt();
		
		
		int salary = 0;
		SalaryExpr expr = null;
		if(month%2 ==0) {
		expr = new SalaryExpr(100);
		salary = expr.getSalary(grade);
			
		}else {
			
		expr = new SalaryExpr(0);
		salary = expr.getSalary(grade);
		}
		
		System.out.println(month + "월 " +  grade + "등급의 월급은" +  salary  +"입니다");
		
			
		
	
	}

}
