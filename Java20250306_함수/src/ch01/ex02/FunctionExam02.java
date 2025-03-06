package ch01.ex02;

/*
 * 
 * 
 * 함수 2개 생성
 * 매개변수로 100 정수값을 전달하면
 * 함수 1은 1~100사이 홀수 값 합을 리턴
 * 함수 2는 1~100사이 짝수 값 합을 리턴
 * 메인함수에서 두 값을 호출하고, 각 전달받은 값을 출력한다.
 */

public class FunctionExam02 {

	public static void main(String[] args) {
	int[] number = new int [10];
	
	for(int i=0; i<10; i++){
		number[i] = (i+1)*10;
	}
	for (int i=0; i<10; i++) {
		System.out.print(number[i]+ " ");
	}
	System.out.println();	
	int result1 = func1(number); 
	int result2 = func2(number);
	System.out.println(result1);
	System.out.println(result2);
	}
	public static int func1(int [] numA ) {
		int sum = 0;
	    for(int i=0; i<numA.length; i++) {
	    	if((numA[i]/10)%2 == 0 ) {
	    		sum += numA[i];
	    	}
	    }
		
		return sum;
	
	}
	public static int func2(int[ ]numB) {
		int sum =0;
		for(int i = 0; i<numB.length; i++) {
			if (numB[i]/10%2 !=0) {
				sum += numB[i];
				
			}
		}
		return sum;
			
		
	}
}
