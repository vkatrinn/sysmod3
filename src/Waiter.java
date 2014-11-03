import hw3.Experience;

import java.util.ArrayList;

/**
 * @(#) Waiter.java
 */
public class Waiter extends Employee {
	public Waiter(String name, String surname, Experience experience) {
		super(name, surname, experience);
		// TODO Auto-generated constructor stub
	}

	private java.util.List<Table> table;

	public void assignTables(ArrayList<Table> tables) {
		this.table = tables;
	}

	public int ComputeSalary() {
		return super.ComputeSalary();
	}

	public int getCostOfTraining() {
		return 800;
	}
}
