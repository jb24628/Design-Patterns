package fasade;
/**
 * 
 * @author Jireh Bethely
 * Class For Rice
 */
public class Rice implements Food {

	@Override
	public void cook() { //cooks the rice
		System.out.println("Cooking rice");
	}

}
