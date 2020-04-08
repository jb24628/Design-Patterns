package fasade;
/**
 * 
 * @author Jireh Bethely
 * Class for Carrots
 */
public class Carrots implements Food {
	
	public void cook() { //cooks the carrots
		System.out.println("Cooking carrots");
	}
	
	public void chop() {
		System.out.println("Chopping carrots");
	}
}
