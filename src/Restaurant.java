import hw3.ReputationLevel;
import java.util.List;

/**
 * @(#) Restaurant.java
 */
public class Restaurant {
	private java.util.List<MenuItem> menuitems;

	private java.util.List<Employee> employees;

	private java.util.List<Table> tables;

	private String name;

	private String address = "J.Liivi 2";

	private String city = "Tartu";

	private int budget = 10000;

	private int reputationPoints = 15;

	private java.util.List<Order> orders;

	public Restaurant( List<MenuItem> menuitem, List<Employee> employee, String name ) {
		this.menuitems = menuitem;
		this.employees = employee;
		this.name = name;
	}

	public ReputationLevel CalculateReputation( ) {
		if (reputationPoints < 15)
			return ReputationLevel.LOW;
		if (reputationPoints >= 30)
			return ReputationLevel.HIGH;
		return ReputationLevel.MEDIUM;
	}

	public void PopulateTables( ) {
		if (this.CalculateReputation().equals(ReputationLevel.HIGH)) {
			// TODO occupy all tables
		}
		if (this.CalculateReputation().equals(ReputationLevel.MEDIUM)) {
			// TODO occupy 5 tables
		} else {
			// TODO occupy 2 tables
		}
	}

	public void ComputeClientStatistics( ) {

	}

	public void paySalaries( ) {
		for (Employee e : employees) {
			this.budget -= e.ComputeSalary();
		}
	}

	public void setName( String name ) {
		this.name = name;
	}

	public String getName( ) {
		return name;
	}

	public void setAddress( String address ) {
		this.address = address;
	}

	public String getAddress( ) {
		return address;
	}

	public void setCity( String city ) {
		this.city = city;
	}

	public String getCity( ) {
		return city;
	}

	public void setBudget( int budget ) {
		this.budget = budget;
	}

	public int getBudget( ) {
		return budget;
	}

	public void setReputationPoints( int reputationPoints ) {
		this.reputationPoints = reputationPoints;
	}

	public int getReputationPoints( ) {
		return reputationPoints;
	}

}
