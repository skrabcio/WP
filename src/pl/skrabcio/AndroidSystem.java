package pl.skrabcio;

public class AndroidSystem extends PhoneDecorator {

	public AndroidSystem (PhoneSystem sys) {
		
		super(sys);
	}
	
	@Override
	
	public void compose() {
		
		super.compose();
		System.out.println("Android");
	}
	
}
