import java.util.List;
import java.util.Random;

public class Order {
	private Client client;
	private java.util.List<MenuItem> menuItems;
	private boolean foodSat = false;
	private boolean bevSat = false;
	private boolean servSat = false;

	public Order(Client client, List<MenuItem> menuItems, int foodSatProb,
			int bevSatProb, int servSatProb) {
		Random r = new Random();
		this.client = client;
		this.menuItems = menuItems;
		if (r.nextInt(101) < foodSatProb)
			foodSat = true;
		if (r.nextInt(101) < bevSatProb)
			bevSat = true;
		if (r.nextInt(101) < servSatProb)
			servSat = true;
	}

	public Client getClient() {
		return client;
	}

	public java.util.List<MenuItem> getMenuItems() {
		return menuItems;
	}

	public int calculateProductionCost() {
		int cost = 0;
		for (MenuItem m : menuItems)
			cost += m.computeProductionPrice();
		return cost;
	}

	public int calculatePrice() {
		int price = 0;
		for (MenuItem m : menuItems)
			price += m.getPrice();
		return price;
	}

}
