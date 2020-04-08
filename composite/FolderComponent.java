package composite;
/**
 * 
 * @author jireh
 * Interface for folder components
 */
public interface FolderComponent {

	public void add(FolderComponent fc);
	public void remove(FolderComponent fc);
	public void print();
	public void print(int i);
	
}
