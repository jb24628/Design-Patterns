package command;
/**
 * 
 * @author Jireh Bethely
 * Command to turn a radio off
 */
public class RadioOff implements Command {
	private Radio radio;
	private int timesPressed; //keeps track of the number of times the button was pressed to make sure the command can be undone
	//Constructor
	public RadioOff(Radio newRadio) {
		this.radio = newRadio;
		timesPressed = 0;
	}

	//turns the radio off
	public void execute() {
		radio.turnOff();
		timesPressed++;
	}

	//turns the radio back on (if it was ever turned off)
	public void undo() {
		if (timesPressed > 0) {
			radio.turnOn();
			timesPressed--;
		}
	}
}
