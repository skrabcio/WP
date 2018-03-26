package pl.skrabcio;

import java.util.ArrayList;

public interface FactoryInterface {
	
	public void addItem(String nameItem);
	public void deleteItem(int indexItem);
	public ArrayList<String> listItem();
	public void sortItem();

}
