package decorator;

public class BlackBeans extends Topping {
	
	public BlackBeans(Burrito b) {
		super(b);
	}

	@Override
	public String getDescription() {
		return burrito.getDescription() + ", black beans";
	}

	@Override
	public double cost() {
		return burrito.cost();
	}

	@Override
	public double calories() {
		// TODO Auto-generated method stub
		return burrito.calories()+130;
	}

}
