package iterator;
/**
 * 
 * @author Jireh Bethely
 * Represents a song
 */
public class Song {

	String name;
	String artist;
	//Constructor
	public Song(String name, String artist) {
		super();
		this.name = name;
		this.artist = artist;
	}
	
	//Getters and setters
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	//String representation
	@Override
	public String toString() {
		return name + " (" + artist + ")";
	}
	
}
