package oopintro;

public class Product {

	public Product() {
		System.out.println("Ben �al��t�m.");
		
	}
	
	public Product(int id,String name,double unitPrice, String detail ) {
		
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;  // alttakilerle contructor tiplerini e�itlemi� ten�mlam�� olduk.
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
}
