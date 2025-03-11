package ch01.ex05;

public class Student {

	private String name;
	private int id;
	private static int studentCount = 0;
	
	public Student(String name, int id) {
		this.name = name;
		this.id= id;
		studentCount++;
		
	}
	public static int getStudentCount() {
		return studentCount;
	}
	
	public void prinfInfo() {
		System.out.println("이름" + name + ", 학번 : " + id);
	}
}
