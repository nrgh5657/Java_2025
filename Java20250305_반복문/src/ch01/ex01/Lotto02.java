package ch01.ex01;

import java.util.Random;

public class Lotto02 {

	public static void main(String[] args) {

		/*
		 * 로또 프로그램
		 * 배열 : 6칸짜리 int 배열
		 * 로또는 1~45 랜점하게 저장
		 * 단, 중복 불가
		 * 
		 * 
		 * 
		 */
		
		int[]lotto = new int[45];
		
		for(int i =0 ; i<lotto.length; i++) {
			
		
			lotto [i] = i+1;
		 
			 
		 }
		
		for(int i=0; i<500; i++) {
			int index = (int)(Math.random()*45);
			
			int temp = lotto[0];
			lotto[0]= lotto[index];
			lotto[index] = temp;
		}
		
		System.out.println("이번 주 예상 로또 번호");
		for(int i=0; i<6; i++) {
			System.out.print(lotto[i] + " ");
		}
		
		
		
		
		
	}

}
