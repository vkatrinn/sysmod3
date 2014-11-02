<<<<<<< HEAD
/**
 * @(#) Restaurant.java
 */

public class Restaurant
{
=======
public class Restaurant {

>>>>>>> 5259543ea809078ad695ec9b6fbbcb479c136156
	private MenuItem menuitem;

	private Orders orders;

	private Employee employee;

	private Table table;

	private String name;

	private String address;

	private String city;

	private int budget;

	private int reputationPoints;

	public void PaySuppliers(int amount) {

	}

	public void CalculateReputation() {

	}

	public void PayUtilities(int amount) {

	}

	public void PaySalaries(int amount) {

	}

	public void PopulateTables() {

	}

	public void ComputeClientStatistics() {

	}

	public void PayForTraining(int amount) {

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddress() {
		return address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCity() {
		return city;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public int getBudget() {
		return budget;
	}

	public void setReputationPoints(int reputationPoints) {
		this.reputationPoints = reputationPoints;
	}

	public int getReputationPoints() {
		return reputationPoints;
	}
}
