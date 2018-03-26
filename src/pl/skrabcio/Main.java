package pl.skrabcio;

import pl.skrabcio.Factory.FactoryType;

public class Main {

	public static void main(String[] args) {
		
		Factory factoryObject = new Factory();
		
	Factory.createFactory(FactoryType.Users).addItem("Abc");
	Factory.createFactory(FactoryType.Users).addItem("def");
	Factory.createFactory(FactoryType.Users).addItem("ghj");
	Factory.createFactory(FactoryType.Users).listItem();
	}

}
