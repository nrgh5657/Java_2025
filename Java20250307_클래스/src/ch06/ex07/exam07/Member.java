package ch06.ex07.exam07;

public class Member {

	private String name;
	private String id;
	private String password;
	private int age;
	
	Member() {
		
	}
	String getName() {
		return name;
	}
	void setName(String name) {
		this.name = name;
	}
	String getId() {
		return id;
	}
	void setId(String id) {
		this.id = id;
	}
	String getPassword() {
		return password;
	}
	void setPassword(String password) {
		this.password = password;
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	Member(String name){
		this(name, "asdf1234", "qwer1234", 00);
	}
	Member(String name, String id){
		this(name, id, "qwer1234", 00);
	}
	Member(String name, String id, String password){
		this(name, id, password, 24);
	}
	Member(String name, String id, String password, int age){
		this.name = name;
		this.id = id;
		this.password = password;
		this.age = age;
	}
    void displayMemberInfo(){
    	System.out.println(name);
    	System.out.println(id);
    	System.out.println(password);
    	System.out.println(age);
    }
}
