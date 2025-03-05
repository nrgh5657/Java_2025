package ch01.ex03;

import java.util.Scanner;

public class CheckEx03 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	boolean flag = true;
	int num = 0;
	int []scores = null;
	while(flag) {
		System.out.println("-------------------------------------------------");
		System.out.println("1. 학생수 | 2.점수입력 | 3.점수 리스트 | 4.분석 | 5.종료 ");
		System.out.println("--------------------------------------------------");
		System.out.print("선택> ");
		
		num = Integer.parseInt(sc.nextLine());
	 	if(num ==1) {
			System.out.print("학생 수> ");
			int index = Integer.parseInt(sc.nextLine());
			scores = new int[index];
	 	}else if(num==2) {
		    for(int i=0; i<scores.length; i++) {
		    	System.out.printf("scores[%d]>", i);
		    	scores[i] = Integer.parseInt(sc.nextLine());
		    	
		    }
	 	}else if(num==3) {
	 		 for(int i=0; i<scores.length; i++) {
			 System.out.printf("scores[%d] : %d\n", i, scores[i]);
	 		 }
	 	}else if(num==4) {
	 		int max = scores[0];
	 		int sum = 0;
	 		double avg=0;
	 		for(int i=0; i<scores.length; i++) {
	 			if(max<scores[i]) {
	 				max = scores[i];
	 			}
	 			sum += scores[i];
	 			avg = sum/(double)scores.length;
	 		}
	 		System.out.printf("최고 점수: %d\n평균 점수: %.1f\n", max, avg);
	 		
	 	}else if(num==5) {
	 		flag = false;
	 	}
	}
	System.out.println("종료");
		
		
	}

}
