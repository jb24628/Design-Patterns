package decorator;

public class WhiteRice extends Topping {

	public WhiteRice(Burrito b) {
		super(b);
	}
	
	@Override
	public String getDescription() {
		return burrito.getDescription() + ", white rice";
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
