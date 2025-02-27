package ch03.sec01;

public class IncreaseEx {

	public static void main(String[] args) {
		
		int x = 10;
		int y = 10;
		int z;
		
		x++;
		++x;
		System.out.println("x= " + x);
	
		System.out.println("------------");
		y--;
		--y;
		System.out.println("y= " + y);
		
		System.out.println("------------");
		z= x++;
		System.out.println("z= " + z);
		System.out.printf("x= %d\n", x);
		
		System.out.println("------------");
		
		z= ++x;
		System.out.println("z= " + z);
		System.out.printf("x= %d\n", x);
		
		System.out.println("------------");
		z = ++x + y++;
		System.out.printf("z= %d\n", z);
		System.out.printf("x= %d\n", x);
		System.out.printf("y= %d\n", y);
				

		
		
	}

}
