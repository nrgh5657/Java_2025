package ex03;

public class MainPerson {

	public static void main(String[] args) {
	
	Person p2 = new UniversityStudent();
	
		
		
	Person p1 = new Person();
	Student s1 = new Student();
	UniversityStudent u1 = new UniversityStudent();
	
	method (u1);
	method (s1);
	method (p1);
	
	}
	//p가 참조하고 있는 대상은 Person 객체 이거나 Person 상속한 객체
	static void  method(Person p ) {
		//p가 참조하고 있는게 University이니?
		if(p instanceof UniversityStudent) {
			UniversityStudent u =(UniversityStudent)p;
			p.sleep();
			u.study();
			u.registerCourse();
			
			//아니면 p가 참조하고 있는게 Student이니?
		}else if (p instanceof Student) {
			Student s =(Student)p;
			s.sleep();
			s.study();
		}else {
			p.sleep();
		}
		System.out.println("-----------------------");
	}
	
}
