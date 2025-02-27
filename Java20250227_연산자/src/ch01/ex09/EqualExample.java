package ch01.ex09;

public class EqualExample {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 10;
		
		String str1 = "korea";
		String str2 = "korea";
		
		System.out.println(num1 == num2);
				
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		String str3 = new String("korea");
		String str4 = new String("korea");
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str3 == str4);
				
	    boolean result1 = str3.equals(str4);
	    System.out.println(result1);
	    
	    boolean result2 = !str3.equals(str4);
	    System.out.println(result2);
	    System.out.println("--------------");
	
	    
	    System.out.println(5>2 & 3<8); //AND 
	    System.out.println(5>2 ^ 3>1); //XOR 연산 값이 같으면 false 연산값이 다르면 true 
	    System.out.println(5>2 ^ 3<1);
	    System.out.println(5<2 ^ 3>1); 
	    System.out.println(5<2 ^ 3<1); 
	    System.out.println("-----------");
	    
	    System.out.println((!(5<3)));
	
	
	
	}

}
