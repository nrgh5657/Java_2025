package ch01.ex02;

class GrandParent{
	String 할아버지성함;
	GrandParent(){
		
	}
	GrandParent(String 할아버지성함){
		this.할아버지성함= 할아버지성함;
	}
}
class Parent extends GrandParent{
	int 아버지연세;
	Parent(){
		
	}
	public Parent(String 할아버지성함, int 아버지연세){
		super(할아버지성함);
		this.아버지연세 = 아버지연세;
		
	}
	
}
class Child extends Parent{
	String 나의취미;
	Child(){
		
	}
	public Child(String 할아버지성함, int 아버지연세, String 나의취미){
		super(할아버지성함, 아버지연세);
		this.나의취미 = 나의취미; 
		
	}
	void displayInfo() {
		System.out.println("할아버지 성함은 " + 할아버지성함);
		System.out.println("아버지 연세는 " + 아버지연세);
		System.out.println("나의 취미는 " + 나의취미);
	}
}
public class MainClass {
	public static void main(String[ ] args) {
		Child child = new Child("차OO", 57, "농구");
		child.displayInfo();
	}

}
