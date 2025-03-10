package ch01.ex02;

public class Car {

	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	
	static void runStatic(){
		System.out.println("Static Run()");
	}
	
	static String companyState = "GM";
	
	public Car(){
		this("현대", "그랜져", "검정", 250);
	}

	
	public Car(String company, String model, String color, int maxSpeed){
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	public void run() {
		System.out.println(company + " 달린다.");
	}
	
	public void displayInfo() {
		System.out.println(company);
		System.out.println(model);
		System.out.println(color);
		System.out.println(maxSpeed);
	}
	

}
