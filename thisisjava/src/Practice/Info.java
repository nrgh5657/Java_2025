package Practice;

import lombok.Data;
import lombok.Getter;

@Data
@Getter

public class Info {

	private String name;
	private String phone;
	private String major;
	private int age;
	
	Info(){
		
	}
	

	
	Info(String name){
		this.name = name; 
	}
	Info(String name, String phone){
		this.name = name;
		this.phone = phone;
	}
	Info(String name, String phone, String major){
		this.name = name;
		this.phone = phone;
		this.major = major; 
	}
	Info(String name, String phone, String major, int age){
		this.name = name; 
		this.phone = phone; 
		this.major = major; 
		this.age = age; 
	}
	
	
	
	
	
}
