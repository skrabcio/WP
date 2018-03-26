package pl.skrabcio;

import java.util.ArrayList;

public class Privileges implements FactoryInterface{

private ArrayList<String> privilegesList = new ArrayList<String>();
	
	@Override
	public void addItem(String nameItem) {
		this.privilegesList.add(nameItem);
	}
	
	@Override
	public void deleteItem(int indexItem) {
		this.privilegesList.remove(indexItem);
	}
	
	@Override
	public ArrayList<String> listItem() {
		return this.privilegesList;
	}
	
	@Override
	public void sortItem() {
		this.privilegesList.sort(null);
	}
	
	

}
