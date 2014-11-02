/**
 * @(#) Barman.java
 */
public class Barman extends Employee {

	public int ComputeSalary( ) {
		return super.ComputeSalary() + 100;
	}

	public int getCostOfTraining( ) {
		return 1200;
	}
}
