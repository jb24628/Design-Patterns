package decorator;

public class Queso extends Topping {

	public Queso(Burrito b) {
		super(b);
	}
	
	@Override
	public String getDescription() {
		return burrito.getDescription() + ", queso";
	}

	@Override
	public double cost() {
		return burrito.cost() + 1.3;
	}

	@Override
	public double calories() {
		// TODO Auto-generated method stub
		return burrito.calories() + 120;
	}

}
