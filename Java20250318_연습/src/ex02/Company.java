package ex02;

public class Company {

	public static void main(String[] args) {
	Employee [] employees = new Employee[2];
	employees[0] = new Secretary("Duke", 1, "secretary", 800);
	employees[1] = new Sales("Tuxi", 2, "sales", 1200);
	boolean isTax = false;
	Company.printEmployee(employees, isTax);
	
	for(Employee emp : employees) {
		if(emp instanceof Bonus) {
		 ((Bonus)emp).incentive(100);
		}
		if (emp.tax()>0) {
			isTax = true;
		}else {
			isTax = false;
		}
			
	}
	System.out.println();
	System.out.println("[인센티브 100지급]");	 
	Company.printEmployee(employees, isTax);
	}
	
	
	public static void printEmployee(Employee[]emp, boolean isTax) {
		
		if(isTax) {
	
		System.out.println("name\t\tdepartment\t\tsalary\t\ttax\t\textra pay");
		System.out.println("--------------------------------------------------------------------------------");
			
		for(Employee e: emp) {
			System.out.printf("%-17s%9s%20d", e.getName(), e.getDepartment(), e.getSalary());
			if(e instanceof Secretary) {
				Secretary s = (Secretary)e;
				System.out.printf("%12.1f",s.tax());
			}	
			if(e instanceof Sales) {
				Sales s = (Sales)e;
				System.out.printf("%12.1f%22.1f",s.tax(), s.getExtraPay());
		}
		System.out.println();
		}
	}
	else {
	System.out.println("name\t\tdepartment\t\tsalary\t\textra pay");
	System.out.println("------------------------------------------------------------------------------------");
	for(Employee e: emp) {
			System.out.printf("%-17s%9s%20d", e.getName(),e.getDepartment(), e.getSalary());
		if(e instanceof Sales) {
			Sales s = (Sales)e;
			System.out.printf("%19.1f", s.getExtraPay());
		}
		System.out.println();
	}	
	}
	}
}

