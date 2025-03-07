package ch02.ex02;

public class MainStudent {

	public static void main(String[] args) {

		
		
		
		
		
		
		//1. Student 객체 생성하면서 이름(홍길동), 학년(3), 나이 입력 20입력
		Student s1 = new Student("홍길동", 3, 20);

		//2. printInfo() 메소드 호출
		s1.printInfo();
		
		Student s2 = new Student();
		s2.setName("이순신");
		//3. 이름을 이순신으로 변경
	
		String name = s2.getName();
		System.out.println(name);
		//4. 변경된 이름 출력


		s2.setGrade(5);
		//5. 학년 5로 변경

		System.out.println(s2.getGrade());
		//6. 변경된 학년만 출력
		
	}

}
