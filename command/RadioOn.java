package command;
/**
 * 
 * @author Jireh Bethely
 * Command to turn a radio off
 */
public class RadioOn implements Command {
	private Radio radio;
	private int timesPressed; //keeps track of the number of times the button was pressed to make sure the command can be undone
	//Constructor
	public RadioOn(Radio newRadio) {
		this.radio = newRadio;
		timesPressed = 0;
	}

	//Turns the radio on
	public void execute() {
		radio.turnOn();
		timesPressed++;
	}

	//Turns the radio off assuming it was turned on
	public void undo() {
		if (timesPressed > 0) {
			radio.turnOff();
			timesPressed--;
		}
	}
}
