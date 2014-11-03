import hw3.Experience;

/**
 * @(#) Chef.java
 */
public class Chef extends Employee {
	private String taxcode;

	public Chef( String name, String surname, Experience experience, String taxcode ) {
		super(name, surname, experience);
		this.taxcode = taxcode;

	}

	public void setTaxcode( String taxcode ) {
		this.taxcode = taxcode;
	}

	public String getTaxcode( ) {
		return taxcode;
	}

	public int ComputeSalary( ) {
		return super.ComputeSalary() + 100;
	}

	public int getCostOfTraining( ) {
		return 1200;
	}

}
