package ex02;

public class Sales extends Employee implements Bonus {
	Sales(){
	
	}
	
	Sales(String name, int number, String department, int salary){
		super(name, number, department, salary);
	}
	
	public double tax() {
		return (double)(getSalary()*0.13);
	}
	
	public void incentive(int pay) {
		int salary = getSalary(); 
		salary += pay*1.2;
		setSalary(salary);
	}
	public double getExtraPay() {
		return getSalary()*0.03;
	}
}
