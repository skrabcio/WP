package pl.skrabcio;

import java.util.ArrayList;

public class Users implements FactoryInterface{

	private ArrayList<String> usersList = new ArrayList<String>();
	
	@Override
	public void addItem(String nameItem) {
		this.usersList.add(nameItem);
	}
	
	@Override
	public void deleteItem(int indexItem) {
		this.usersList.remove(indexItem);
	}
	
	@Override
	public ArrayList<String> listItem() {
		return this.usersList;
	}
	
	@Override
	public void sortItem() {
		this.usersList.sort(null);
	}


}