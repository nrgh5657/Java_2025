package ex01;

public class MessureRuntimeExample {

	public static void main(String[] args) {

		
		int sum = 0;
		long time1 = System.nanoTime();
		for(int i=0; i<=100000000; i++)
			sum += i;
		long time2 = System.nanoTime();
		
		System.out.println("합: " + sum);
		System.out.println(time2 - time1);
	}

}
