package command;
/**
 * 
 * @author Jireh Bethely
 * Command to turn the volume down
 */
public class RadioVolumeDown implements Command {
	Radio radio;
	int timesPressed;
	//Constructor
	public RadioVolumeDown(Radio newRadio) {
		this.radio = newRadio;
		timesPressed = 0;
	}

	//turns the volume down
	public void execute() {
		radio.volumeDown();
		timesPressed++;
	}

	//turns the volume back up
	public void undo() {
		if (timesPressed > 0) {
			radio.volumeUp();
			timesPressed--;
		}
	}
}
