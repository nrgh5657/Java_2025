package ex07;

public class ProductMain {

	public static void main(String[] args) {
		
		Product []p = new Product[5];
		
		p[0] = new Product();
		p[1] = new Product("펩시 제로", 20, 2300);
		p[2] = new Product("츄파 츕스", 50, 300);
		p[3] = new Product("스니커즈", 10, 1500);
		p[4] = new Product("Kit Kat", 3, 2000);
		
		for(int i = 0; i< p.length; i++) {
			System.out.println(p[i]);
		}
		
	}

}
