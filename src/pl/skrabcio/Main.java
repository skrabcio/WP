package pl.skrabcio;

public class Main {

	public static void main(String[] args) {
		
		SingletonList.getInstance().addToList("2.0");
		SingletonList.getInstance().addToList("3.0");
		SingletonList.getInstance().addToList("4.0");
		SingletonList.getInstance().addToList("5.0");
		System.out.println(SingletonList.getInstance().getList());
		SingletonList.getInstance().removeFromList(0);
		System.out.println(SingletonList.getInstance().getList());
		
	}

}
