package ch01.ex03;

class GrandParent{
	private String 할아버지성함;

	GrandParent(String 할아버지성함){
	this.할아버지성함 = 할아버지성함	;
	}

	public String get할아버지성함() {
		return 할아버지성함;
	}
}
	class Parent extends GrandParent{
		private int 아버지연세;

	public Parent(String 할아버지성함, int 아버지연세){
		super(할아버지성함);
		this.아버지연세= 아버지연세;
		
	}
	
	public int get아버지연세() {
		return 아버지연세;
	}

}
class Child extends Parent{
	String 나의취미;

	public Child(String 할아버지성함, int 아버지연세, String 나의취미){
		super(할아버지성함, 아버지연세);
		this.나의취미 = 나의취미; 
		
	}
	void displayInfo() {
		System.out.println("할아버지 성함은 " + get할아버지성함());
		System.out.println("아버지 연세는 " + get아버지연세());
		System.out.println("나의 취미는 " + 나의취미);
	}
}
public class MainClass {
	public static void main(String[ ] args) {
		Child child = new Child("차OO", 57, "농구");
		child.displayInfo();
	}

}

