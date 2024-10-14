package InventoryManagementSystemforaWarehouse;

public class Product {
	String name;
	double price;
	int quantity;
	public Product(String name, double price, int quantity) {
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	public void displayInfo() {
		System.out.println(this.name );
		System.out.println(this.price);
		System.out.println(this.quantity);
	}
	public void updateQuantity(int newQuantity) {
		this.quantity=newQuantity;
	}
	public void updateQuantity(int addedQuantity, boolean addToExisting) {
		if(addToExisting) {
			this.quantity+=addedQuantity;
		}
		else {
			this.quantity=addedQuantity;
		}
	}
	public double getPrice() {
		return this.price;
	}
	public static void welcomeMessage() {
		System.out.println("Welcome");
	}
}
