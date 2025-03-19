package ex07;

public class GuGuDanExpr extends Multiplication{

	GuGuDanExpr(){}
	
	GuGuDanExpr(int dan){
	super(dan);
	}
	
	GuGuDanExpr(int dan, int num){
	super(dan, num);	
	}
	
	public static void printAll() {
		for(int m=2; m<=9;m++) {
			System.out.println("*** " +  "단 ***");
		 for(int n=1; n<=9; n++) {
			 System.out.println(m + " x " + n + "= " + (m*n));
		 	}
		}
		
	}
}
