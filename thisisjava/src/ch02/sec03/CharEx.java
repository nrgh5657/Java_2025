package ch02.sec03;

public class CharEx {

	public static void main(String[] args) {
		
		// char => 2byte, 16bit, 0 ~ 2^16-1,  0 ~ 65535 (유니코드)
		
		char c1 = 'A';
		char c2 = 65;
		
		char c3 = '가';
		char c4 = 0xAC00;
		char c4a = 44032; 
		char c5 = 32;
		char c6 =' ';
		
		//ctrl + alt + 방향키 아래
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c4a);
		System.out.println("c5: " + c5);
		System.out.println("c6: " + c6);
		
		//alt + 방향
	}

}
