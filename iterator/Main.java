package iterator;
/*
 * Author: Jireh Bethely
 * Uses the my Iterable Class
 */
public class Main {

	public static void main (String args[]) {
		Song[] songs = { //declares songs
				new Song("Bernie and the Jets", "Elton John"), 
				new Song("The Entertainer","Billy Joel"), 
				new Song("A Hard Day's Night","The Beatles"),
				new Song("Beast of Burden","The Rolling Stones"),
				new Song("Walking Contradiction","Green Day"),
				new Song("Love Never Felt So Good","Michael Jackson"),
				new Song("Bring It on Home to Me","The Animals")};
		
		SongIterator si = new SongIterator(songs);
		
		for (Song s : si) { //iterates through the songs
			System.out.println(s.toString());
		}
		/* Because of the iterator pattern, this code also works
		while (si.hasNext()) {
			System.out.println(si.next().toString() + ".");
		}*/
	}
}
