package InventoryManagementSystemforaWarehouse;

public class Food extends Product{
String expirationDate;
public Food(String name, double price, int quantity, String expirationDate) {
	super(name, price, quantity);
	this.expirationDate=expirationDate;
}
public void displayInfo() {
	super.displayInfo();
	System.out.println(this.expirationDate);
}
}
