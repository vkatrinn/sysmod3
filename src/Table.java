import java.util.ArrayList;

/**
 * @(#) Table.java
 */
public class Table {
	private java.util.List<Client> clients = new ArrayList<Client>();

	private int number;

	public Table(int number) {
		this.number = number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public int getNumber() {
		return number;
	}

	public java.util.List<Client> getClients() {
		return clients;
	}

	public void setClients(java.util.List<Client> clients) {
		this.clients = clients;
	}

}
