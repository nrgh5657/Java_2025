package ch01.ex05;

public class StaticEx {

	public static void main(String[] args) {

		Student s1 = new Student("김철수", 101);
		Student s2 = new Student("이영희", 102);
		Student s3 = new Student("박민수", 103);
		
		s1.prinfInfo();
		s2.prinfInfo();
		s3.prinfInfo();
		
		System.out.println("전체 학생 수:" + Student.getStudentCount());
		
	}

}
