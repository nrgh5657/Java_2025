package ex02;

public class MainPerson {

	public static void main(String[] args) {
	UniversityStudent u1 = new UniversityStudent("지리산", 20, "한체대", 3, "전산");
	u1.introduce();
			
	Person p1 = new Person("내장산", 20);
	p1.introduce();
	
	Student s1 = new Student("치악산", 15, "천호초등학교", 3);
	s1.introduce();
	
	System.out.println("--------------------------------");
	System.out.println(p1);
	System.out.println(p1.toString());
	System.out.println(u1);
	System.out.println(u1.toString());
	System.out.println(s1);
	System.out.println(s1.toString());
	System.out.println("------------상위클래스는 하위클래스 참조 가능-------------");
	
	Person p2 = new Student();
	Student s2 = new UniversityStudent();
	System.out.println("------------하위 클래스는 상위클래스 참조 불가------------");
	
//	Student s3 = new Person();
// 왜 안될까? 
	
	System.out.println("------------하위 클래스가 상위클래스 참조 가능한 경우------------");
	Person p4 = new Student();
	Student s4 = (Student)p4; 
	p4.introduce();
	
	//가능
	//왜? 기능에 제한이 없어서
	System.out.println("--------------------------");
	
//	p4 = new Person();
//	s4 = (Student)p4;
//	p4.introduce();
	//불가
	//
	System.out.println("------------다 형 성 => 자동변환 + 오버라이딩 ------------");
		
	Person p5 = new Person();
	p5.sleep();
	System.out.println();
	p5.introduce();
	System.out.println(p5);
	
	p5 = new Student();
	p5.sleep();
	System.out.println();
	p5.introduce();
	System.out.println(p5);
	
	p5 = new UniversityStudent();
	p5.eat();
	System.out.println();
	p5.introduce();
	System.out.println(p5);
	
	
	}

}
