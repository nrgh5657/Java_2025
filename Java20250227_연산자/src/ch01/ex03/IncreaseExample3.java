package ch01.ex03;

public class IncreaseExample3 {

	public static void main(String[] args) {
		
		int a = 1;
		int b = 0;
		
		b = ++a;
		System.out.println( "a= "+ a + ", b= "+b);
		System.out.printf("a= %d, b= %d\n", a,b);
	
		int c = 1;
		int d = 0;
		
		d= c++;
		System.out.printf("c=%d, d=%d", c, d);
	}

}
