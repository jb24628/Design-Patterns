package adapter;
/**
 * 
 * @author Jireh Bethely
 * Implementation of the adapter pattern
 */
public class AndroidAdapter implements IPhoneCharger {
	//The iPhoneCharger that is being adapted to work as an AndroidCharger
	IPhoneCharger charger;
	
	public AndroidAdapter(IPhoneCharger charger) {
		this.charger = charger;
	}
	
	//Charges the Android Phone
	@Override
	public void startCharging() {
		charger.startCharging();
		
	}
	//Stops charging the Android Phone
	@Override
	public void stopCharging() {
		charger.stopCharging();
	}
	
}
