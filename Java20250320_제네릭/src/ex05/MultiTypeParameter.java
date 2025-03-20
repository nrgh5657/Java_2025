package ex05;

class DBox<L, R>{
	private L left;
	private R right;
	
	public void set(L left, R right) {
		this.left = left;
		this.right = right;
	}
	@Override
	public String toString() {
		return left + "&" + right;
		
	} 

	
}
class Person{
	
}




public class MultiTypeParameter {
   
	public static void main(String[] args) {
		
    	DBox<String, Integer> iBox= new DBox<>();
    	iBox.set("홍길동", 20);
    	System.out.println(iBox);
    	
    	
    	DBox<Person, String> pBox = new DBox();
    	pBox.set(new Person(), "홍길동");
    
    	
    } 
     
     
	
	
}
