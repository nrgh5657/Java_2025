package ch01.ex01;

import java.util.Random;

public class Lotto {

	public static void main(String[] args) {

		/*
		 * 로또 프로그램
		 * 배열 : 6칸짜리 int 배열
		 * 로또는 1~45 랜점하게 저장
		 * 단, 중복 불가
		 * 
		 */
		
		int[]lotto = new int[6];
		int num;
		boolean flag = false;
		for(int i =0 ; i<lotto.length; i++) {
			num =(int)(Math.random()*45+1);
			for (int j = 0; j<lotto.length;j++) {
				if(num == lotto[j]) {
					flag = true;
					break;
				}
			}
			if(flag != true)
			lotto [i] = num;
			else
				i--;
			flag = false;
			 
		 }
		
		
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		
		int temp;
		for(int i=0; i<lotto.length-1; i++) {
			for(int j= i+1; j < lotto.length; j++) {
				if(lotto[i]<lotto[j]) {
					temp = lotto[i];
					lotto [i] = lotto[j];
					lotto [j] = temp;							
				}
			}
		}
		
		for(int i=0; i<lotto.length; i++){
			System.out.print(lotto[i] + " ");
		}
		
	}

}
