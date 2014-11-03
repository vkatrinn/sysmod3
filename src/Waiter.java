import java.util.ArrayList;
import hw3.Experience;

/**
 * @(#) Waiter.java
 */
public class Waiter extends Employee {
	private java.util.List<Table> tables;

	public Waiter( String name, String surname, Experience experience ) {
		super(name, surname, experience);
	}

	public void assignTables( ArrayList<Table> tables ) {
		this.tables = tables;
	}

	public int ComputeSalary( ) {
		return super.ComputeSalary();
	}

	public int getCostOfTraining( ) {
		return 800;
	}
}
