package ex07;

public class GuGuDanApp {

	public static void main(String[] args) {
		int dan = (int)(Math.random()*20)+1;
		int num = (int)(Math.random()*20)+1;		
		System.out.print(dan + "  ");
		System.out.println(num);
		
		if((dan<=9) && (num>=1 && num<=9)) {
			GuGuDanExpr expr = new GuGuDanExpr(dan, num);
			expr.printPart();
		}else if((dan>=1 && dan<=9) && (num>=10)){
			GuGuDanExpr expr = new GuGuDanExpr(dan);
			expr.printPart();
		}else if(dan>=10) {
			GuGuDanExpr expr = new GuGuDanExpr(dan);
			expr.printAll();
		}
		
	}
		
}
