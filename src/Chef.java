/**
 * @(#) Chef.java
 */
public class Chef extends Employee {
	private String taxcode;

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
