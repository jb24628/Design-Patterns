package command;
/**
 * 
 * @author Jireh Bethely
 * The interface to interact with the remote and radio
 */
public class User {

	public static void main(String args[]) {
		//Creates a new radio
		Radio r = new Radio();
		//Creates a remote for the radio with 6 buttons
		RadioInvoker remote = new RadioInvoker(6);
		//Sets the buttons of the remote to have commands such as turning the radio on and off
		remote.setButtonCommand(0, new RadioOn(r));
		remote.setButtonCommand(1, new RadioOff(r));
		remote.setButtonCommand(2, new RadioVolumeUp(r));
		remote.setButtonCommand(3, new RadioVolumeDown(r));
		remote.setButtonCommand(4, new RadioScanForNext(r));
		remote.setButtonCommand(5, new RadioScanForPrev(r));
		
		remote.pressButton(0); //turns the radio on
		remote.pressButton(2); //turns volume up
		remote.undo(); //turns the volume back down
		remote.pressButton(4); //scans for the next radio station
		remote.pressButton(3); //turns the volume down
		remote.pressButton(5); //scans for the previous radio station
		remote.undo(); //goes back to the last radio station that was listened to
		remote.pressButton(1); //turns radio off

	}
}
