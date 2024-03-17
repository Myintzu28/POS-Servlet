package model;

public class Product {

	private int id,cat_id;
	private String name;
	private double price;
	private String image;
	private String description;
	public Product(int id, int cat_id, String name, double price, String image, String description) {
		super();
		this.id = id;
		this.cat_id = cat_id;
		this.name = name;
		this.price = price;
		this.image = image;
		this.description = description;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCat_id() {
		return cat_id;
	}
	public void setCat_id(int cat_id) {
		this.cat_id = cat_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	

}
