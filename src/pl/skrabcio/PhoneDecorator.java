package pl.skrabcio;

public class PhoneDecorator implements PhoneSystem {

	private PhoneSystem phoneSystem;
	
	public PhoneDecorator(PhoneSystem Sys) {
		
		this.phoneSystem = Sys;
	}
	
	@Override
	
	public void compose() {
		
		this.phoneSystem.compose();
	}
}
