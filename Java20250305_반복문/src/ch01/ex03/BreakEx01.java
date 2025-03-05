package ch01.ex03;

public class BreakEx01 {

	public static void main(String[] args) {

		int sum = 0;
		int i=0;
		for(; i<=100; i++) {
			sum += i;
		 if(sum >= 20) {
			 break;
		 }
		}
		System.out.println(i);
		System.out.println(sum);
	}

}
