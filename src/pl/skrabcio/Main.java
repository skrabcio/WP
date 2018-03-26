package pl.skrabcio;

import pl.skrabcio.Factory.FactoryType;

public class Main {

	public static void main(String[] args) {
		
		FactoryInterface factoryUsers = (new Factory()).createFactory(FactoryType.Users);
		FactoryInterface factoryProducts = (new Factory()).createFactory(FactoryType.Products);
		
		factoryUsers.addItem("User3");
		factoryUsers.addItem("User2");
		factoryUsers.addItem("User1");
		System.out.println(factoryUsers.listItem());
		factoryUsers.deleteItem(1);
		System.out.println(factoryUsers.listItem());
		factoryUsers.sortItem();
		System.out.println(factoryUsers.listItem());
		
		factoryProducts.addItem("Product1");
		factoryProducts.addItem("Product2");
		factoryProducts.deleteItem(0);
		System.out.println(factoryProducts.listItem());
	}

}
