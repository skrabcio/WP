package pl.skrabcio;

public class IOSSystem extends PhoneDecorator {

	public IOSSystem(PhoneSystem sys) {

		super(sys);
	}

	@Override
	public void compose() {

		super.compose();
		System.out.print(" IOS");
	}
}
