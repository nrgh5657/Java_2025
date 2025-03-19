package ex07;

public class Human {

	private String name;
	private int age;
	private int height;
	private int weight;
 
	Human(){
		
	}
	Human(String name, int age, int height, int weight){
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public String printInfo() {
		return name +"\t"+ age + "\t" + height + "\t"+ weight;
	}
}
