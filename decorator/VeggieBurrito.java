package decorator;

public class VeggieBurrito extends Burrito {

	public VeggieBurrito() {
		description = "Veggie Burrito";
		calories = 20;
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 7.15;
	}

	@Override
	public double calories() {
		// TODO Auto-generated method stub
		return calories;
	}

}
