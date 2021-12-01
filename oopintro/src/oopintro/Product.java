package oopintro;

public class Product {

	public Product() {
		System.out.println("Ben çalýþtým.");
		
	}
	
	public Product(int id,String name,double unitPrice, String detail ) {
		
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
		this.detail = detail;  // alttakilerle contructor tiplerini eþitlemiþ tenýmlamýþ olduk.
	}
	
	int id;
	String name;
	double unitPrice;
	String detail;
	
}
