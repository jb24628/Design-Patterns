package decorator;

public class SofritasBurrito extends Burrito {
	
	public SofritasBurrito() {
		description = "Sofritas Burrito";
		calories = 150;
	}
	
	@Override
	public double cost() {
		// TODO Auto-generated method stub
		return 7.15;
	}

	@Override
	public double calories() {
		// TODO Auto-generated method stub
		return 0;
	}

}
