package fasade;
/**
 * 
 * @author Jireh Bethely
 * 
 */
public class Cooker {

	public static void main(String args[]) {
		//Creates an order of stir fry
		StirFry order = new StirFry();
		
		order.make(); //makes the stir fry
		order.serve(); //serves the stir fry
	}
}
