package ch01.ex01;

public class MainClass {

	public static void main(String[] args) {

		C c1 = new C("지리산" , "전북 남원", 40);
		c1.funcA();
		c1.funcB();
		c1.funcC();
		System.out.println();
		
		B b1 = new B("한라산", "제주");
		b1.funcA();
		b1.funcB();
		
		B b2 = c1;
		b2.funcA();
		b2.funcB();
		System.out.println();
		
		A a1 = new B("아차산", "서울");
		a1.funcA();
		
		A a2 = b2;
		a2.funcA();
		
		/*
		 * 상위 클래스는 하위클래스를 참조할수 있다
		 * 단. 하위클래스 자원에는 접근 불가
		 * 자신 클래스에만 접근 가능
		 */
		
	//	B b2 = new A("남산", "서울"); => 반대는 안됨
		
	System.out.println("-----------강제 타입 변환--------------");
	
	
	A a3 = new B("백두산", "함경북도");
	B b3 = new B("백두산", "함경북도");
	
	B b4 = new C("백두산", "함경북도", 90); // 자동타입변환
	B b5 = (B)a2;	//강제 타입변환
	
	A a7 = new B();
	B b7 = new B();
	b7 = (B)a7;
	b7.funcA();

/*	A a6 = new A();
	B b6 = new B();
	b6=(B)a6;
	b6.funcA();
*/
	
	
	A a8 = new C();
	B b8;
	
	b8 = (B)a8;
	
	b8.funcA();
	
	A a9 = new C();
	C c9 ;
	c9= (C)a9;
	
	A a10  = new A();
	B b10 = new B();
	
	a10 = b10;
	
	System.out.println();
	B b11 = (B)a10;
	b11.funcA();
	
	
	
	
	
	
		
		
	}

}
