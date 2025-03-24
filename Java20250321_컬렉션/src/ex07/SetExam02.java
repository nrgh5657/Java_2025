package ex07;

import java.util.HashSet;
import java.util.Set;

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
		Set<Num> set = new HashSet<Num>();
		
		set.add(new Num(1234));
		set.add(new Num(1357));
		set.add(new Num(1395));
		set.add(new Num(1234));
		set.add(new Num(1357));
		
		for(Num n : set)
			System.out.println(n);
	
	}

}
