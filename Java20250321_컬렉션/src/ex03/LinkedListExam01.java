package ex03;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExam01 {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		list.add("Toy");
		list.add("Box");
		list.add("Robot");
		list.add("Toy");
		
		list.add(0, "Robot");
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		System.out.println();
		
		for(String str : list)
			System.out.println(str);
		System.out.println();
		System.out.println("-------------------------------------------");
		Iterator<String> itr = list.iterator();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		System.out.println();
		itr = list.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(); 
		
		
		
		System.out.println("-------------------------------------------");
		System.out.println(list.toString());
		System.out.println();
		
		list.remove(0); 
		System.out.println(list.get(0));
		System.out.println(list.get(1));
//		System.out.println(list.get(2));
		
		list.clear(); //전부삭제
//		System.out.println(list.get(0));
	

	
	}

}
