package ex03;

public class UniversityStudent extends Student {


	private String major;
	private boolean isInterns;
	private int scholarship;
	
	public UniversityStudent() {}
	
	UniversityStudent(String name, int age, String schoolName, int grade, String major) {
	super(name, age, schoolName, grade);
	this.major = major;
	}
	
	void registerCourse() {
		System.out.println("registerCourse()......");
	}
	@Override
	public String toString() {
		return "UniversityStudent [major = " + major + "]";
	}
	@Override
	void introduce() {
		System.out.println("안녕하세요. 저는 " + major + " 전공하고 있는 " + getName() + "입니다");
	}
}
