package pl.skrabcio;

public class Factory {
	
	public static FactoryInterface getObject(String className) {
		
		if (className.equalsIgnoreCase("users")) return new Users();
		if (className.equalsIgnoreCase("products")) return new Products();
		
		
		
		
	}

}
