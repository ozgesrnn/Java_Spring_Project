package oopintro;

public class Category {
	private int id;
	private String name;
	
	public Category() {
		
	}

	public int getId() { //okuma yapar get 
		return this.id;
	}
	
	public void setId(int id) { //veriyi çekecek iþleyecek, yazacak ; içine veri girmeliyiz
		this.id = id;
	}
	
	public String getName() {
		return this.name + "!";
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
