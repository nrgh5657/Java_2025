package ch01.ex01;

import java.util.Random;

public class 정렬02 {

	public static void main(String[] args) {

		//seed 값을 넣으주면 랜덤한 숫자가 일정하게 나온다
		//		int seed= 1234;
		//		Random random = new Random(seed);
		// seed 값이 없으면 랜덤하게 추출
		
		Random random = new Random();
		
		int[] numArr = new int[4];
		
		int tmp;
		//랜덤하게 1~100사이 값을 배열에 넣는다.
		for(int i = 0; i<numArr.length; i++) {
			tmp =(int)random.nextInt(100)+1;
			numArr[i] = tmp;
		}
		for(int i=0; i<numArr.length; i++) {
			System.out.print(numArr[i] + " ");
		}
		
		int max, min;
		max = min = numArr[0];
		
		for(int i=1; i<numArr.length; i++) {
			if(max< numArr[i]) {
				max = numArr[i];	
			}
			if(min> numArr[i]) {
				min = numArr[i];
			}
		
		}
		System.out.println();
		System.out.println();
		System.out.println("최댓값: " + max + " 최소값: " + min );
	
		System.out.println();
	
		int sum = 0;
		double avg =0;
		
		for(int i=0; i<numArr.length; i++) {
		sum += numArr[i];
		avg = sum/(double)numArr.length;
			
		}
		System.out.printf("총점 : %d, 평균 : %.2f\n", sum, avg);
		System.out.println();
		
/* 33 50 39 20 [i]    temp
 * 33 50 39 20[j]
 * 																						
 * i=0 j=1 [i] = 33 [j] = 50, 33 < 50, temp = [i] = 33, [i] = [j] = 50, [j]= temp = 33           
 * -> 50 33 39 20
 * 
 * i=1 j=2 [i] = 33 [j] = 39, 33 < 39, temp = [i] = 33, [i] = [j] = 39, [j]= temp = 33
 * -> 50 39 33 20
 * 
 * i=2 j=3 [i] = 33 [j] = 20  33 > 20 -> for문 벗어남
 * 
 *  
 *
 *
 */																								
		
		int temp;
		for(int i =0; i<numArr.length-1;i++) {
			for(int j = i+1; j<numArr.length;j++) {
				if(numArr[i]<numArr[j]) {
					temp = numArr[i];
					numArr[i] = numArr[j];
					numArr[j] = temp;
				}
			}
		}
	for(int i= 0; i<numArr.length; i++)
		System.out.print(numArr[i] + " ");
	}

}
