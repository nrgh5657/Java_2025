package ch01.ex03;

public class IncreaseExample2 {

	public static void main(String[] args) {

		
		int a = 1;
		int b = 0;
		
		a = a+1;
		b = a;
		System.out.println( "a= "+a+ ", b= "+b);
		System.out.printf("a= %d, b= %d\n", a,b);
	
		int c = 1;
		int d = 0;
		
		d = c;
		c = c+1;
		System.out.printf("c=%d, d=%d", c, d);
	
	}

}
