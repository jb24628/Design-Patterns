package adapter;
/**
 * 
 * @author Jireh Bethely
 * An Android Charger for phones that use USB-C
 */
public class USBCCharger implements AndroidCharger {

	public USBCCharger() {
		
	}
	
	//Starts charging the Android phone
	@Override
	public void startCharging() {
		System.out.println("Charging USB-C Android Device.");
	}

	//Stops charging the Android phone
	@Override
	public void stopCharging() {
		System.out.println("No longer charging USB-C Android Device.");
	}

}
