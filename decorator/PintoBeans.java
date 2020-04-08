package decorator;

public class PintoBeans extends Topping {

	public PintoBeans(Burrito b) {
		super(b);
	}
	
	@Override
	public String getDescription() {
		return burrito.getDescription() + ", pinto beans";
	}

	@Override
	public double cost() {
		return burrito.cost();
	}

	@Override
	public double calories() {
		// TODO Auto-generated method stub
		return burrito.calories() + 210;
	}

}
