package pl.skrabcio;

import java.util.ArrayList;

public class Privileges implements FactoryInterface{

private ArrayList<String> privilegesList = null;
	
	@Override
	public void addItem(String nameItem) {
		privilegesList.add(nameItem);
	}
	
	@Override
	public void deleteItem(int indexItem) {
		privilegesList.remove(indexItem);
	}
	
	@Override
	public ArrayList<String> listItem() {
		return this.privilegesList;
	}
	
	@Override
	public void sortItem() {
		privilegesList.sort(null);
	}
	
	

}
