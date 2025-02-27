package ch02.sec02;

public class LongEx {

	public static void main(String[] args) {
        
		//long => 8byte, 64bit, -2^63 ~ 2^63-1, -9.223372036854775808 ~ 9.223,372,036,854,775,807
		
		 long var1 = 10;
         long var2 = 20L;
         //long var3 = 1000000000000; => 컴파일러는 정수 리터럴을 int 로 간주, 오류 발생, long 타입 값임을 알려줘야 함 => long var3 = 1000000000000L; 
         long var4 = 1000000000000L;
         
         System.out.println(var1);
         System.out.println(var2);
         System.out.println(var4);
      

         int v1 = 15;
         if (v1>10); {
        	 int v2 = v1 - 10 ;
   
         }
         //int v3 = v1 + v2 + 5; -> v2 변수를 구할수 없음
         
         
	}

}
