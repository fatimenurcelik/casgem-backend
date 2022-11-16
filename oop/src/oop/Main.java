package oop;

public class Main {

	public static void main(String[] args) {
		Product product1 =new Product();
		product1.setId(1);
		product1.setName("Elma");
		product1.setDiscountRate(10);
		product1.setUnitPrice(50);
		
		System.out.println(product1.getName());
		System.out.println(product1.getDiscountedPrice());
	}

}
