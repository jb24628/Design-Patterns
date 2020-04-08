package command;
import java.util.Stack;
/**
 * 
 * @author Jireh Bethely
 * Command scan for the next radio station
 */
public class RadioScanForNext implements Command {
	Radio radio;
	Stack<Double> prevStations;
	//Constructor
	public RadioScanForNext(Radio newRadio) {
		this.radio = newRadio;
		prevStations = new Stack<Double>();
	}
	//scans for for the next radio station
	public void execute() {
		prevStations.push(radio.getCurrentStation());
		radio.seekNext();
	}
	//goes back to the previous station that was listened to
	public void undo() {
		if (!prevStations.isEmpty()) {
			radio.setCurrentStation(prevStations.pop());
			radio.printCurrentStation();
		}
	}
}
