package iterator;
import java.util.Iterator;

/**
 * 
 * @author Jireh Bethely
 * Implements the Iterator pattern
 */
public class SongIterator implements Iterator<Song>, Iterable<Song> {

	Song[] songs; //stores the songs
	int maxSize;
	int currPos; //keeps track of the current position
	
	//constructor for the implementation
	public SongIterator(Song[] songs) {
		this.songs = songs;
		maxSize = songs.length;
		currPos = 0;
	}
	//Checks to see if there is another song
	@Override
	public boolean hasNext() {
		if (currPos == maxSize || songs[currPos] == null) {
			return false;
		}
		return true;
	}
	//Gets the next song
	@Override
	public Song next() {
		// TODO Auto-generated method stub
		Song temp = songs[currPos];
		currPos++;
		return temp;
	}
	
	public void remove() {
		throw new UnsupportedOperationException();
	}
	//Returns an iterator
	@Override
	public Iterator<Song> iterator() {
		return this;
	}
}
