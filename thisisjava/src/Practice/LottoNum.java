package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class LottoNum {

	public static void main(String[] args) {
		int[]lotto= new int[6];
		int num;
		boolean run = false;
		for(int i=0; i<lotto.length; i++) {
			num =(int)(Math.random()*45+1);
			for(int j=0; j<lotto.length; j++) {
				if(num==lotto[j]) {
					run = true;
					break;
				}
			}
		if(run != true)
			lotto [i] = num;
		else
			i--;
		run = false;
			
		}
		for(int i=0; i<lotto.length; i++ ) {
			System.out.print(lotto[i] + " ");
	}
		System.out.println();
	
		for(int i =0; i<lotto.length; i++) {
			for(int j=0; i<j; j++) {
				if (lotto [i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println(Arrays.toString(lotto));
	
	
	}

}
