package ch02.sec02;

public class IntegeraLiteralEx {

	public static void main(String[] args) {
	
	// int 4byte, 32bit, -2^31 ~ 2^31-1, -2,147,483,648 ~ 2,147,483,647 
		
       int var1 = 0b1011;  //이진법 1*2^3 + 0 + 1*2^1 + 1*2^0 = 11 
	   
	   int var2 = 0206;   // 8진법 0 ~ 7  ex) 013 = 1*8^1 + 3*8^0 = 11, 0206 = 2*8^2 + 0*8 + 6*8^0 = 128 + 0 + 6 = 134
	   
	   int var3 = 365;   // 10진법 0 ~ 9
	   
	   int var4 = 0xB3; //  16진법 0 ~ 9 A(11) B(12) C(13) ex) 0xb3 = 11*16^1 + 3*16^0 = 179
	                                                       // 0x2A0F = 2*16^3 + 10*16^2 + 0*16^1 + 15*16^0 = 10767
	   
	   System.out.println("var1: " + var1);
	   System.out.println("var2: " + var2);
	   System.out.println("var3: " + var3);
	   System.out.println("var4: " + var4);
	}

}
