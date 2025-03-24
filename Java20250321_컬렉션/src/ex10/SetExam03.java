package ex10;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import lombok.Getter;
@Getter
class Person implements Comparable<Person>{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		
	}
	@Override
	public String toString() {

		return name+ " & " + age;
	}
	@Override
	public int compareTo(Person o) {
		int nameCompare = this.name.compareTo(o.name);
		
		if(nameCompare !=0) {
			return nameCompare;
		}
		return Integer.compare(this.age, o.age);
	}
	
	@Override
	public int hashCode() {
		
		int result = name !=null? name.hashCode() : 0;
	
		result =  31*result +age;
		return result;
	}
/*	@Override
	public int compareTo(Person o) {
		return Integer.compare(this.age, o.age);
	}*/
	

}



public class SetExam03 {

	public static void main(String[] args) {

		Set<Person> p = new TreeSet<Person>();
		
		p.add(new Person("AAA", 20));
		p.add(new Person("BBB", 56));
		p.add(new Person("BBB", 10));
		p.add(new Person("AAA", 20));
		p.add(new Person("AAA", 39));
		p.add(new Person("BBB", 10));
		p.add(new Person("DDD", 30));
		p.add(new Person("FFF", 60));
		p.add(new Person("GGG", 45));
		
		Iterator<Person> itr = p.iterator();
		while(itr.hasNext()){
				System.out.println(itr.next());
		}
	
	}

}
