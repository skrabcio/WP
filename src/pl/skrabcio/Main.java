package pl.skrabcio;

public class Main {

	public static void main(String[] args) {

		PhoneSystem AndroidSystem = new AndroidSystem(new Smartphone());
		AndroidSystem.compose();

		PhoneSystem IOSSystem = new IOSSystem(new Smartphone());
		IOSSystem.compose();

		PhoneSystem MixSystem = new AndroidSystem(new IOSSystem(new Smartphone()));
		MixSystem.compose();
	}
}
