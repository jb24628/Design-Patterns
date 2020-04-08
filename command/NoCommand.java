package command;
/**
 * 
 * @author Jireh Bethely
 * Implementation of an empty command
 */
public class NoCommand implements Command {
	//Default constructor
	public NoCommand() {
		
	}
	//tells the user that no command has been specified
	@Override
	public void execute() {
		System.out.println("No command specified");
	}
	//tells the user that no command has been specified
	@Override
	public void undo() {
		System.out.println("No command specified");
	}

}
