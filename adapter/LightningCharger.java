package adapter;
/**
 * 
 * @author Jireh Bethely
 * An IPhoneCharger for devices that use the lightning charger
 */
public class LightningCharger implements IPhoneCharger {
	
	public LightningCharger() {
		
	}
	
	//Starts charging the iPhone
	@Override
	public void startCharging() {
		System.out.println("Now charging iPhone.");
	}
	
	//Stops charging the iPhone
	@Override
	public void stopCharging() {
		System.out.println("No longer charging iPhone.");
	}

}
