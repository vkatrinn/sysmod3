import hw3.Experience;

/**
 * @(#) Barman.java
 */
public class Barman extends Employee {

	public Barman( String name, String surname, Experience experience ) {
		super(name, surname, experience);
	}

	public int computeSalary( ) {
		return super.computeSalary() + 100;
	}

	public int getCostOfTraining( ) {
		return 1200;
	}
}
