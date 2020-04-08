package fasade;
/**
 * 
 * @author Jireh Bethely
 * Class for Stir Fry
 */
public class StirFry {

	//Ingredients for the rice
	private Rice rice;
	private Onions onions;
	private Carrots carrots;
	private Peas peas;
	//Keeps track of whether or not the StirFry was made or not
	private boolean made;
	
	//Creates objects of the ingredients
	public StirFry() {
		rice = new Rice();
		onions = new Onions();
		carrots = new Carrots();
		peas = new Peas();
		made = false;
	}

	//Prepares the stir fry
	public void make() {
		System.out.println("Preparing stiry fry...\n");
		rice.cook();
		onions.chop();
		onions.cook();
		carrots.chop();
		carrots.cook();
		peas.cook();
		made = true;
		System.out.println("Putting everything together.\n\nDone making stir fry\n");
	}
	//serves the stir fry
	public void serve() {
		if (made) {
			System.out.println("Serving stir fry");
		}
	}
}