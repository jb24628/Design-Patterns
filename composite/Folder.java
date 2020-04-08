package composite;

import java.util.ArrayList;
import java.util.Iterator;
/**
 * 
 * @author Jireh Bethely
 * Represents folders
 *
 */
public class Folder implements FolderComponent, Iterator<FolderComponent>, Iterable<FolderComponent> {

	String folderName;
	ArrayList<FolderComponent> subComponents;
	int currPos;
	
	//constructor
	public Folder(String name) {
		folderName = name;
		currPos = 0;
		subComponents = new ArrayList<FolderComponent>();
	}
	
	//adds to inside the folder
	@Override
	public void add(FolderComponent fc) {
		subComponents.add(fc);
	}

	//removes from the folder
	@Override
	public void remove(FolderComponent fc) {
		subComponents.remove(fc);
	}

	//prints the file name and the contents of the folde
	@Override
	public void print() {
		print(0);
	}
	
	//prints the file name and the contents of the folder. The number is so that it can adjust the tabs to make it easier to read
	public void print(int i) {
		
		for (int j = 0; j < i; j++) {
			System.out.print("\t");
		}
		
		System.out.println("/" + folderName + ":");
		for (FolderComponent fc : subComponents) {
			for (int j = 0; j < i; j++) {
				System.out.print("\t");
			}
			fc.print(i+1);
		}
	}

	//getters and setters
	public String getFolderName() {
		return folderName;
	}

	public void setFolderName(String folderName) {
		this.folderName = folderName;
	}
	//methods that must be overriden for the Iterable and Iterator interfaces
	@Override
	public Iterator<FolderComponent> iterator() {
		return this;
	}

	@Override
	public boolean hasNext() {
		if (currPos < subComponents.size()) {
			return true;
		}
		return false;
	}

	@Override
	public FolderComponent next() {
		FolderComponent temp = subComponents.get(currPos);
		currPos++;
		return temp;
	}

}
