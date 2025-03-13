package ex01;

public class UniversityStudent extends Student {
/*	private String name;
	private int age;
	private String gender;
	
	private String schoolName;
	private int grade;
*/
	private String major;
	private boolean isInterns;
	private int scholarship;
	
	void registerCourse() {}
	void introduce() {
		System.out.println("안녕하세요. 저는 " + major + "전공하고 있는 " + getName() + "입니다");
	}
}
