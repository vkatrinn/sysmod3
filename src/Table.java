import java.util.ArrayList;
import java.util.List;

/**
 * @(#) Table.java
 */
public class Table {
	private java.util.List<Client> clients = new ArrayList<Client>();

	private int number;

	public Table( int number ) {
		this.number = number;
	}

	public void setNumber( int number ) {
		this.number = number;
	}

	public int getNumber( ) {
		return number;
	}

	public List<Client> getClients( ) {
		return clients;
	}

	public void setClients( List<Client> clients ) {
		this.clients = clients;
	}

}
