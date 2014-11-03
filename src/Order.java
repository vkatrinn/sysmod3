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
		if (r.nextInt(101) < foodSatProb
				- (((menuItems.get(0).getPrice() - menuItems.get(0)
						.computeProductionPrice())) / 3) * 10)
			foodSat = true;
		if (r.nextInt(101) < bevSatProb
				- (((menuItems.get(1).getPrice() - menuItems.get(1)
						.computeProductionPrice())) / 3) * 10)
			bevSat = true;
		if (r.nextInt(101) < servSatProb)
			servSat = true;
	}

	public boolean isFoodSat() {
		return foodSat;
	}

	public void setFoodSat(boolean foodSat) {
		this.foodSat = foodSat;
	}

	public boolean isBevSat() {
		return bevSat;
	}

	public void setBevSat(boolean bevSat) {
		this.bevSat = bevSat;
	}

	public boolean isServSat() {
		return servSat;
	}

	public void setServSat(boolean servSat) {
		this.servSat = servSat;
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
