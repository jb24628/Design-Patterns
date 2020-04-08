package decorator;

public class CarnitasBurrito extends Burrito {
	
	public CarnitasBurrito() {
		description = "Carnitas Burrito";
		calories = 210;
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 7.65;
	}

	@Override
	public double calories() {
		// TODO Auto-generated method stub
		return calories;
	}

}
