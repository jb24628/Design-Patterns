package command;
/**
 * 
 * @author Jireh Bethely
 * Command to turn the volume up
 */
public class RadioVolumeUp implements Command {
	Radio radio;
	int timesPressed;
	//Constructor
	public RadioVolumeUp(Radio newRadio) {
		this.radio = newRadio;
		timesPressed = 0;
	}

	//turns the radio up
	public void execute() {
		radio.volumeUp();
		timesPressed++;
	}

	//turns the radio back down
	public void undo() {
		if (timesPressed > 0) {
			radio.volumeDown();
			timesPressed--;
		}
	}
}
