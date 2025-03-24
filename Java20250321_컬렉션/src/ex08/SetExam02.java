package ex08;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import lombok.Getter;
@Getter
class Num{
	private int num;
	public Num(int num) {
		this.num = num;
	}
	
	public String toString() {
		return num + "";
	}
			
	
	@Override
	public int hashCode() {
		return num%5;

	}
	
	@Override
	public boolean equals(Object obj) {
		Num number = (Num)obj;
		return this.num == number.num;	
				}

}


public class SetExam02 {

	public static void main(String[] args) {
		Set<String> set = new TreeSet<>();
		
		set.add("Toy");
		set.add("toy");
		set.add("Box");
		set.add("Robot");
		set.add("Toy");
		set.add("box");
		
/*		set.add(new Num(1234));
		set.add(new Num(1357));
		set.add(new Num(1395));
		set.add(new Num(1234));
		set.add(new Num(1357));*/
		//TreeSet 은 정렬이 필수 => 정렬 조건이 없기 때문에 오류 발생


		for(String n : set)
			System.out.println(n);
		
		System.out.println();
		
		Set<Integer> iset = new TreeSet<>();
		iset.add(40);
		iset.add(30);
		iset.add(50);
		iset.add(10);
		iset.add(20);
		iset.add(40);
		iset.add(30);
		
		for(int n : iset)
			System.out.println(n);
		
		
	
	}

}
