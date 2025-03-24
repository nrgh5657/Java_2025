package ex12;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class Coin{
	private int value;
	public Coin(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public String toString() {
		return String.valueOf(value);
	}

}

public class StackExample {

	
	public static void main(String[] args) {
		
		Queue<Coin> coinBox = new ArrayDeque<Coin>();
		
		coinBox.add(new Coin(100));
		coinBox.add(new Coin(50));
		coinBox.add(new Coin(500));
		coinBox.add(new Coin(10));
		
		/*while(!coinBox.isEmpty()) {
			Coin coin = coinBox.poll();
			System.out.println("꺼내온 동전 : " + coin.getValue() + "원");
			
		}*/
		System.out.println();
		
		Iterator<Coin> itr = coinBox.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
