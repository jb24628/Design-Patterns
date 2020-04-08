package command;
/**
 * 
 * @author Jireh Bethely
 * Interface for command classes
 */
public interface Command {
	public void execute();
	public void undo();
}
