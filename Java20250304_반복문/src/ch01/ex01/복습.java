package ch01.ex01;

public class 복습 {

	public static void main(String[] args) {

		int num = 0;
		int num2 = 0;
		int num3 = 0;

		num = num+1; //num(1)
		num += 1;    //num(2)
		num2 = ++num; //전위연산자(증감)
		num3= num++; //후위연산자(증감)
		
		System.out.printf("%d %d %d\n", num, num2, num3);
		
	}

}
