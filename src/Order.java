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

}
