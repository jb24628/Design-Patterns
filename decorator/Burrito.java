package decorator;

public abstract class Burrito {

	protected String description;
	protected int calories;
	public Burrito() {
		description = "Unknown burrito type";
		calories = 0;
	}
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
	public abstract double calories();
}
