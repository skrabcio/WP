package pl.skrabcio;

import java.util.ArrayList;

public class Users implements FactoryInterface{

	private ArrayList<String> usersList = null;
	
	@Override
	public void addItem(String nameItem) {
		usersList.add(nameItem);
	}
	
	@Override
	public void deleteItem(int indexItem) {
		usersList.remove(indexItem);
	}
	
	@Override
	public ArrayList<String> listItem() {
		return this.usersList;
	}
	
	@Override
	public void sortItem() {
		usersList.sort(null);
	}


}