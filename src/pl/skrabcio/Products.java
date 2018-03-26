package pl.skrabcio;

import java.util.ArrayList;

public class Products implements FactoryInterface {
	
	private ArrayList<String> productsList = null;
	
	@Override
	public void addItem(String nameItem) {
		productsList.add(nameItem);
	}
	
	@Override
	public void deleteItem(int indexItem) {
		productsList.remove(indexItem);
	}
	
	@Override
	public ArrayList<String> listItem() {
		return this.productsList;
	}
	
	@Override
	public void sortItem() {
		productsList.sort(null);
	}

}
