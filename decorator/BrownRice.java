package decorator;

public class BrownRice extends Topping {
	
	public BrownRice(Burrito b) {
		super(b);
	}
	
	@Override
	public String getDescription() {
		return burrito.getDescription() + ", brown rice";
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
