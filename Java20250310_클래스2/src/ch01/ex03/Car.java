package ch01.ex03;

public class Car {

	private String company;
	private String model;
	private String color;
	private int maxSpeed;

	public static int count;
	

	static void stateFunc() {
		
		
	}
	
	static void runStatic(){
		System.out.println("Static Run()");
		count++;
		companyState = "기아";
		//company = "현대";
		stateFunc();
	
	}
	
	static String companyState = "GM";
	
	public Car(){
		this("현대", "그랜져", "검정", 250); //this(), super()=>함수 맨 앞에
		System.out.println(++Car.count + " 객체생성");
	}

	
	public Car(String company, String model, String color, int maxSpeed){
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	

	
		
	
	
	
		
	

	
	

}
