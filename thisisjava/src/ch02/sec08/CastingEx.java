package ch02.sec08;

public class CastingEx {

	public static void main(String[] args) {

		int var1 = 10;
		byte var2 = (byte) var1;         
		System.out.println(var2);
		
		long var3 = 300;
		int var4 = (int) var3;
		System.out.println(var4);
		
		int var5  = 65;
		char var6  = (char) var5;
		System.out.println(var6);
		
		double var7 = 3.14;
		int var8 = (int) var7;
		System.out.println(var8);
		
		byte var9 = 33;
		char var10 = (char) var9;
		System.out.println(var10);
	
		
		/*5-9 =-4   00000101 -> 5  00001001 -> 9          00000101
	                               11110110  1의보수       +11110111 
 	                                      1  2의보수        ---------
 	                               --------               11111100   
	                               11110111          	-----------
	                                                      00000011
		                                                 -----------
		                                                  00000100   => 4 => -4 		
		*/
	}

	
}
