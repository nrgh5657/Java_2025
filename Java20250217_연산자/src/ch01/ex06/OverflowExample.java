package ch01.ex06;

public class OverflowExample {

	public static void main(String[] args) {
		
		short num1 = 32767;
		short num2 = -32768;
		
		System.out.println(num1);
		System.out.println(num2);
		
		
		num1++;
		System.out.println(num1); // 오버플로우 => 최솟값

		num1++;
		num1++;
		System.out.println(num1);

		
		num2--;
		System.out.println(num2); // 언더플로우 => 최댓값
		
		
	}

}
