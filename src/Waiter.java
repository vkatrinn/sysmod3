import java.util.ArrayList;

/**
 * @(#) Waiter.java
 */
public class Waiter extends Employee {
	private java.util.List<Table> table;

	public void assignTables( ArrayList<Table> tables ) {
		this.table = tables;
	}

	public int ComputeSalary( ) {
		return super.ComputeSalary();
	}

	public int getCostOfTraining( ) {
		return 800;
	}
}
