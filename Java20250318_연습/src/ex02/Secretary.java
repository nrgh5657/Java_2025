package ex02;

public class Secretary extends Employee implements Bonus {
	Secretary(){
	 
	}
	Secretary(String name, int number, String department, int salary){
	 super(name, number, department, salary);
	}
	public  double tax() {
		return getSalary()*0.1;
	}
	
	public void incentive(int pay) {
		int salary = getSalary(); 
		salary += pay*0.8;
		setSalary(salary);
	
	}
	
}
