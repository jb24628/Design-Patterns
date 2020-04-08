package adapter;

public class Main {

	public static void main(String[] args) {
		//Creates iPhone and Android chargers
		IPhoneCharger iPhoneCharger = new LightningCharger();
		AndroidCharger androidCharger = new USBCCharger();
		
		//Lets the iPhone charger charge an Android device
		AndroidAdapter adapter = new AndroidAdapter(iPhoneCharger);
		
		//Starts and stops charging with the iPhone charger
		System.out.println("iPhone charger: ");
		iPhoneCharger.startCharging();
		iPhoneCharger.stopCharging();
		
		//Starts and stops charging with the Android charger
		System.out.println("\nAndroid charger: ");
		androidCharger.startCharging();
		androidCharger.stopCharging();
		
		//Starts and stops charging with the adapter
		System.out.println("\nAndroid adapter: ");
		adapter.startCharging();
		adapter.stopCharging();
	}

}
