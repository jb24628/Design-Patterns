package command;
import java.util.Stack;
/**
 * 
 * @author Jireh Bethely
 * Implementation of a Radio Remote
 */
public class RadioInvoker {

	private Command[] commands; //holds the commands of the remote
	private Stack<Integer> prevCommands; //holds the list of previously called commands.
	//Creates an instance of the remote
	public RadioInvoker(int numOfButtons) {
		commands = new Command[numOfButtons];
		
		for (int i = 0; i < numOfButtons; i++) { //populates the array with empty commands
			commands[i] = new NoCommand();
		}
		
		prevCommands = new Stack<Integer>();
	}
	//gives buttons commands
	public void setButtonCommand(int button, Command c) {
		commands[button] = c;
	}
	//presses the buttons 
	public void pressButton(int button) {
		commands[button].execute();
		prevCommands.push(button);
	}
	//undoes previous action
	public void undo() {
		if (!prevCommands.isEmpty()) {
			commands[prevCommands.pop()].undo();
		}
	}
}
