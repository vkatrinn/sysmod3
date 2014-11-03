import hw3.Experience;

import java.util.ArrayList;

/**
 * @(#) Waiter.java
 */
public class Waiter extends Employee {
	private java.util.List<Table> tables = new ArrayList<Table>();

	public Waiter(String name, String surname, Experience experience) {
		super(name, surname, experience);
	}

	public java.util.List<Table> getTables() {
		return tables;
	}

	public void setTables(java.util.List<Table> tables) {
		this.tables = tables;
	}

	public int ComputeSalary() {
		return super.ComputeSalary();
	}

	public int getCostOfTraining() {
		return 800;
	}
}
