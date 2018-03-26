package pl.skrabcio;

import java.util.ArrayList;

public class Products implements FactoryInterface {
	
	private ArrayList<String> productsList = new ArrayList<String>();
	
	@Override
	public void addItem(String nameItem) {
		this.productsList.add(nameItem);
	}
	
	@Override
	public void deleteItem(int indexItem) {
		this.productsList.remove(indexItem);
	}
	
	@Override
	public ArrayList<String> listItem() {
		return this.productsList;
	}
	
	@Override
	public void sortItem() {
		this.productsList.sort(null);
	}

}
