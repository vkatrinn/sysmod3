import java.util.ArrayList;

/**
 * @(#) Waiter.java
 */
public class Waiter extends Employee {
	private ArrayList<Table> table;

	private ArrayList<Table> tables;

	public void assignTables(ArrayList<Table> tables) {
		this.tables = tables;
	}

}
