package ex07;

import java.util.Scanner;

public class GradeTest {

	public static void main(String[] args) {	
		Scanner sc = new Scanner(System.in);
		System.out.print("데이터 갯수>>");
		int count = sc.nextInt();
		
		int[]nArr = new int[count];
		
		for(int i = 0; i<nArr.length; i++) {
			System.out.println("점수 입력>> ");
			nArr[i] = sc.nextInt();
		}
		
		for(int i =0; i<nArr.length; i++) {
			System.out.print(nArr[i] + ", ");
		}
	System.out.println();
	GradeExpr expr = new GradeExpr(nArr);
	System.out.println("총점: " + expr.getTotal());
	System.out.printf("평균: %.2f\n",  expr.getAverage());
	System.out.println("최고점수: " + expr.getGoodScore());
	System.out.println("최저점수 " + expr.getBadScore());
	}
	
}
