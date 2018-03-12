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
	
}
