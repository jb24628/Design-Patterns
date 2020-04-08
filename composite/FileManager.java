package composite;

public class FileManager {

	
	public static void main(String args[]) {
		//imitates a linux file system
		FolderComponent root = new Folder("home");
		
		FolderComponent user1Folder = new Folder("user1");
		FolderComponent user2Folder = new Folder("user2");
		
		//puts the user folders in the root folder
		root.add(user1Folder);
		root.add(user2Folder);
		
		//creates desktop folders for each user
		FolderComponent user1Desktop = new Folder("Desktop");
		FolderComponent user2Desktop = new Folder("Desktop");
		
		user1Folder.add(user1Desktop);
		user2Folder.add(user2Desktop);
		
		//creates files 
		FolderComponent hw1 = new File("hw1",".docx");
		FolderComponent recipie = new File("recipie",".pdf");
		FolderComponent familyPhoto = new File("family", ".png");
		
		user1Desktop.add(hw1);
		user1Desktop.add(recipie);
		
		user2Desktop.add(hw1);
		
		user2Folder.add(familyPhoto);
		
		root.print();
	}
}
