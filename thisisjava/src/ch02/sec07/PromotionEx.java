package ch02.sec07;

public class PromotionEx {

	public static void main(String[] args) {
       
		// byte < short, char < int < long < float < double 
		
		byte byteValue = 10;
		int intValue = byteValue; //자동 타입 변환
		System.out.println("intValue: " + intValue);
		
		
		char charValue = '가';
		intValue  = charValue;
		System.out.println("가의 유니코드: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doubleValue =  floatValue;
		System.out.println("doubleValue: " + doubleValue);
				
	/*	byte a = 15;
	*   char b = a;  => 컴파일 에러
	*
	*/			//예외 byte는 char 타입으로 변환 x -> byte 는 음수를 포함, char은 음수 포함 안함
	}

}
