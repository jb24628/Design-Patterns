package decorator;

public abstract class Topping extends Burrito {
	
	protected Burrito burrito;
	
	public Topping(Burrito b) {
		burrito = b;
	}
	
	public abstract String getDescription();
	
}
