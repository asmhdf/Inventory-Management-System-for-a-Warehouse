package InventoryManagementSystemforaWarehouse;

public class Main {

	public static void main(String[] args) {
		Product product1 = new Product("name1", 100, 6);
		Product electro1 = new Electronics("name2", 200, 3, "brand1", 2);
		Product food1 = new Food("name3", 60, 10, "15/10/2024");
		Product.welcomeMessage();
		product1.displayInfo();
		electro1.displayInfo();
		food1.displayInfo();
		product1.updateQuantity(50);
		electro1.updateQuantity(10, true);
		food1.updateQuantity(40, false);
		product1.displayInfo();
		electro1.displayInfo();
		food1.displayInfo();
		System.out.println("le prix de produit 1 est : "+ product1.getPrice());
		
	}

}
