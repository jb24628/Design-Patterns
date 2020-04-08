package decorator;

public class Guacamole extends Topping {

	public Guacamole(Burrito b) {
		super(b);
	}
	
	@Override
	public String getDescription() {
		return burrito.getDescription() + ", queso";
	}

	@Override
	public double cost() {
		return burrito.cost() + 2.25;
	}

	@Override
	public double calories() {
		// TODO Auto-generated method stub
		return burrito.calories() + 230;
	}

}
