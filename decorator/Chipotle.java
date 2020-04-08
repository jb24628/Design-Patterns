package decorator;

public class Chipotle {

	public static void main(String args[]) {
		Burrito[] order = new Burrito[3];
		
		Burrito burrito1 = new VeggieBurrito();
		Burrito burrito2 = new SofritasBurrito();
		Burrito burrito3 = new CarnitasBurrito();
		
		burrito1 = new BlackBeans(burrito1);
		burrito1 = new BrownRice(burrito1);
		burrito1 = new Guacamole(burrito1);
		
		burrito2 = new PintoBeans(burrito2);
		burrito2 = new WhiteRice(burrito2);
		burrito2 = new Guacamole(burrito2);
		
		burrito3 = new BlackBeans(burrito3);
		burrito3 = new WhiteRice(burrito3);
		burrito3 = new Queso(burrito3);
		
		order[0] = burrito1;
		order[1] = burrito2;
		order[2] = burrito3;
		
		System.out.println("Your order: ");
		double cost = 0;
		for (Burrito b : order) {
			System.out.println(b.getDescription() + " (" + b.calories() + " calories)");
			cost += b.cost();
		}
		System.out.println("\nCost: $" + cost);
	}
}
