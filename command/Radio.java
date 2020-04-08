package command;
/**
 * 
 * @author Jireh Bethely
 * Implementation of a radio
 */
public class Radio {
	private int volume;
	private double currentStation;
	private boolean on;
	//Creates a Radio
	public Radio() {
		volume = 50;
		currentStation = 93.7;
		on = false;
	}
	//gets the volume of the radio
	public int getVolume() {
		return volume;
	}
	//sets the volume of the radio
	public void setVolume(int volume) {
		this.volume = volume;
	}
	//gets the current radio station
	public double getCurrentStation() {
		return currentStation;
	}
	//sets the current radio station
	public void setCurrentStation(double currentStation) {
		this.currentStation = currentStation;
	}
	//returns whether of not the radio is on or not
	public boolean isOn() {
		return on;
	}
	//turns the radio on
	public void turnOn() {
		System.out.println("Radio is on.");
		on = true;
	}
	//turns the radio off
	public void turnOff() {
		System.out.println("Radio is off.");
		on = false;
	}
	//turns the volume up
	public void volumeUp() {
		if (!on) { return; } //checks if the radio is on. If the radio is off, then it does nothing
		
		if (volume < 100) { //makes sure the volume isn't over the max volume
			++volume;
			System.out.println("Volume is now at: " + volume);
		}
		else {
			System.out.println("Max Volume (100)");
		}
	}
	//turns the volume down
	public void volumeDown() {
		if (!on) { return; } //checks if the radio is on. If the radio is off, then it does nothing
		
		if (volume > 0) { //makes sure that the volume is not negative
			--volume;
			System.out.println("Volume is now at: " + volume);
		}
		else { 
			System.out.println("Sound is off (0).");
		}
	}
	//Displays the current radio station
	public void printCurrentStation() {
		System.out.println("Current Station: " + currentStation);
	}
	//seeks for the next radio 
	public void seekNext() {
		if (!on) { return; } //checks if the radio is on. If the radio is off, then it does nothing
		
		//creates random numbers between .3 and .6. The (int) cast is to make the numbers not have extra digits (i.e. .3544856 vs .3)
		currentStation += (int)(3*Math.random()+3)/10.0; 
		if (currentStation > 108) {
			currentStation = 87.5;
		}
		
		printCurrentStation();
	}
	//seeks for the previous radio station
	public void seekPrev() {
		if (!on) { return; } //checks if the radio is on. If the radio is off, then it does nothing
		
		//creates random numbers between .3 and .6. The (int) cast is to make the numbers not have extra digits (i.e. .3544856 vs .3)
		currentStation -= (int)(3*Math.random()+3)/10.0; 
		if (currentStation < 87.5) {
			currentStation = 108;
		}
		
		printCurrentStation();
	}
}
