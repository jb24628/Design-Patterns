package command;
import java.util.Stack;
/**
 * 
 * @author Jireh Bethely
 * Command scan for the next radio station
 */
public class RadioScanForPrev implements Command {
	Radio radio;
	Stack<Double> prevStations;
	//Constructor
	public RadioScanForPrev(Radio newRadio) {
		this.radio = newRadio;
		prevStations = new Stack<Double>();
	}
	//scans for for the previous radio station
	public void execute() {
		prevStations.push(radio.getCurrentStation());
		radio.seekPrev();
	}
	//goes back to the previous station that was listened to
	public void undo() {
		if (!prevStations.isEmpty()) {
			radio.setCurrentStation(prevStations.pop());
			radio.printCurrentStation();
		}
	}
}
