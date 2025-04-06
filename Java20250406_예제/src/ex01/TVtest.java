package ex01;

public class TVtest {

	public static void main(String[] args) {

		SaleTV saleTV = new SaleTV(300000, "SALETV-1", 40, 1);
		RentalTV rentalTV = new RentalTV(100000, "RENTALTV-10", 42, 1);
		 
		saleTV.channelUP();
		saleTV.channelUP();
		
		
		rentalTV.channelDown();
		rentalTV.channelDown();
		rentalTV.channelDown();
		
		printAllTV(saleTV);
		System.out.println("--------------------------------------------------------");
		
		printAllTV(rentalTV);
		System.out.println("----------------------------------------------------------");
		
		printRentalTV(rentalTV);
	
	}

	static void printAllTV(TV tv) {
		 System.out.println(tv.toString()); 
		if (tv instanceof SaleTV) {
				SaleTV s = (SaleTV) tv;
				s.play();
				s.sale();
	        } else if (tv instanceof RentalTV) {
	        	RentalTV r = (RentalTV) tv;
	        	r.play();
	        	r.rent();
	        }
	}
	static void printRentalTV(Rentable tv) {
		tv.rent();
	}
}
