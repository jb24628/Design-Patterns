package fasade;
/**
 * 
 * @author Jireh Bethely
 * Class for Onions
 */
public class Onions implements Food {

	@Override
	public void cook() { //cooks the onions
		System.out.println("Cooking onions");
	}

	public void chop() {
			System.out.println("Chopping onions");
	}
}
