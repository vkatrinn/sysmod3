import hw3.Experience;
import hw3.ReputationLevel;

import java.util.ArrayList;
import java.util.Collections;
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

	public Restaurant(List<MenuItem> menuitem, List<Employee> employee,
			String name) {
		this.menuitems = menuitem;
		this.employees = employee;
		this.name = name;
	}

	public ReputationLevel calculateReputation() {
		if (reputationPoints < 15)
			return ReputationLevel.LOW;
		if (reputationPoints >= 30)
			return ReputationLevel.HIGH;
		return ReputationLevel.MEDIUM;
	}

	public void assignTables() {
		int i = 0;
		if (this.calculateReputation().equals(ReputationLevel.LOW)) {
			i = 2;
		}
		if (this.calculateReputation().equals(ReputationLevel.MEDIUM)) {
			i = 5;
		} else {
			i = 9;
		}
		ArrayList<Table> tablesforDay = new ArrayList<Table>();
		for (int k = 0; k < i; k++) {
			tablesforDay.add(new Table(k));
		}
		ArrayList<Waiter> waiters = getWaiters();
		Collections.sort(waiters);
		for (Waiter w : waiters)
			System.out.println(w.getExperience());
		for (int j = 0; j < i; j++) {
			if (j < 3) {
				waiters.get(0).getTables().add(tablesforDay.get(j));
			} else if (j < 6) {
				waiters.get(1).getTables().add(tablesforDay.get(j));
			} else
				waiters.get(2).getTables().add(tablesforDay.get(j));
		}
		System.out.println(i + " tables assigned to waitresses!");
	}

	public void populateTables() {

	}

	public void computeClientStatistics() {

	}

	public void paySalaries() {
		for (Employee e : employees) {
			this.budget -= e.ComputeSalary();
		}
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

	public ArrayList<Waiter> getWaiters() {
		ArrayList<Waiter> waiters = new ArrayList<Waiter>();
		for (Employee e : employees) {
			if (e.getClass().equals(
					new Waiter("Waiter", "Waiter", Experience.LOW).getClass()))
				waiters.add((Waiter) e);
		}
		return waiters;
	}

}
