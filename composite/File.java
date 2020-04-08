package composite;
/**
 * 
 * @author Jireh Bethely
 * Represents files
 *
 */
public class File implements FolderComponent {

	String fileName;
	String extension;
	
	//constructor
	public File(String fileName, String extension) {
		super();
		this.fileName = fileName;
		this.extension = extension;
	}
	
	//must override but it is an unsupported operation for this class
	@Override
	public void add(FolderComponent fc) {
		throw new UnsupportedOperationException();
	}
	//must override but it is an unsupported operation for this class
	@Override
	public void remove(FolderComponent fc) {
		throw new UnsupportedOperationException();
	}
	//displays the file name
	@Override
	public void print() {
		System.out.println(fileName + extension);
	}
	//displays the filename with the 
	public void print(int i) {
		for (int j = 0; j < i; j++) {
			System.out.print("\t");
		}
		print();
	}
	
	//getters and setters
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}
	
}
