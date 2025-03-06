package ch04.sec05;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Lotto04 {

	public static void main(String[] args) {

		/*
		 * 로또 프로그램
		 * 배열 : 6칸짜리 int 배열
		 * 로또는 1~45 랜점하게 저장
		 * 단, 중복 불가
		 * 
		 */
		
		Random random = new Random();
		int[]lotto = new int[6];
		int num;
		for(int i =0 ; i<lotto.length; i++) {
			lotto[i] = random.nextInt(45)+1;
			for (int j = 0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
			
		
		
		 }
		for(int i =0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(lotto));
		
			
		
		
	}

}
