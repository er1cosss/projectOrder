package entities;

public class Product {
	
	private String nameProduct;
	private Double priceProduct;
	
	public Product () {
		
	}

	public Product(String name, Double price) {
		this.nameProduct = name;
		this.priceProduct = price;
	}

	public String getName() {
		return nameProduct;
	}

	public void setName(String name) {
		this.nameProduct = name;
	}

	public Double getPrice() {
		return priceProduct;
	}

	public void setPrice(Double price) {
		this.priceProduct = price;
	}
	

}
