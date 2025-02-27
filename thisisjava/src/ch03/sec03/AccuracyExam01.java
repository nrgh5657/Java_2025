package ch03.sec03;

public class AccuracyExam01 {

	public static void main(String[] args) {

		
		double sum = 0;
		
		for(int i = 0; i<30; i++)
			sum = sum + 0.1;
		
		System.out.println(sum);
	
		
		
		int apple = 1;
		double pieceUnit = 0.1;
		int number = 7;
	
		double result = apple - number*pieceUnit;
		System.out.println("사과 1개에서 남은 양: " + result);
		System.out.println("-------------");
		func();
	}	
		
	    public static void func () {
	    	int apple = 1;
			int totalPiecs = apple*10;
			int number = 7;
			
			int result = totalPiecs - number;
			System.out.println("10조각에서 남은 조각: " + result);
			System.out.println("사과 1개에서 남은 양: " + result/10.0);
	    
			
			
			
		}
		
	}


