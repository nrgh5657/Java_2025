package ex07;

public class Multiplication {

	private int dan;
	private int num;
	
	Multiplication(){}
	
	Multiplication(int dan){
		this.dan=dan;
	}
	Multiplication(int dan, int num){
		this.dan = dan;
		this.num = num;
	}
	void printPart() {
		if (num==0) {
			for(int n=1; n<=9; n++)
				System.out.println(dan + "*" + n + "="+dan*n);
			System.out.println();
		}else {
			System.out.println(dan + "*" + num  + "=" + dan*num);
		}
	}
	
}	
