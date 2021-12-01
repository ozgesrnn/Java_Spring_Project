package oopintro;

public class Main {

	public static void main(String[] args) {
		
		Product product1 = new Product(); // referans olu�turma, instance 
		product1.id = 1;
		product1.name = "Lenovo V14";
		product1.unitPrice = 15000 ;
		product1.detail = "16 GB Ram";
		
		Product product2 = new Product(2, "Lenovo V15", 16000 , "16 GB Ram"); 
	
		
		Product product3 = new Product(); 
		product3.id = 3;
		product3.name = "HP 15";
		product3.unitPrice = 10000 ;
		product3.detail = "8 GB Ram";
		
	
		Product[] products = {product1,product2,product3};
		
		for (Product product : products ) {
			System.out.println(product.name);
		}
		System.out.println(products.length);
		
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Elektronik";
		
		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Moda";
		
		ProductManager productManager = new ProductManager();
		productManager.addToCart(product3);

	}

}
