
public class Orders {
	private Client client;
	private java.util.List<MenuItem> menuItems;
	
	public Orders(Client client, java.util.List<MenuItem> menuItems){
		if(client != null && menuItems != null){
			this.client = client;
			//?
			this.menuItems = menuItems;
			//?
		}
	}
	
	public Client getClient(){
		return client;
	}
	
	public java.util.List<MenuItem> getMenuItems(){
		return menuItems;
	}
	
	//no setters
}
