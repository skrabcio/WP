package pl.skrabcio;

import java.util.ArrayList;

public final class SingletonList {

	private final static SingletonList singletonInstance = new SingletonList();
	private ArrayList<String> list = null;
	
	public static SingletonList getInstance() {
		return singletonInstance;
	}
	
	private SingletonList() {
		list = new ArrayList<String>();
	}
	
	public ArrayList<String> getList() {
		return this.list;
	}
	
	public void addToList(String element) {
		list.add(element);
	}
	
	public void removeFromList(int elementIndex) {
		list.remove(elementIndex);
	}
}