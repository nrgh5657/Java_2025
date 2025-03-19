package ex07;

public class Friend extends Person{

	String phoneNum;
	String email;
	
	Friend(String name, String phoneNum, String email){
		super(name);
		this.phoneNum = phoneNum;
		this.email = email;
	}
	String getInfo() {
		return super.getInfo() + phoneNum + "\t" + email; 
	}
}
