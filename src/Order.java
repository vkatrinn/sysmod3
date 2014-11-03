import java.util.List;

public class Order {
	private Client client;
	private java.util.List<MenuItem> menuItems;

	public Order(Client client, List<MenuItem> menuItems) {
		this.client = client;
		this.menuItems = menuItems;
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
