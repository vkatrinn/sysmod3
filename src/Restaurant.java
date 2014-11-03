import hw3.Experience;
import hw3.ReputationLevel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

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

	private java.util.List<Client> clients;

	public Restaurant(List<MenuItem> menuitem, List<Employee> employee,
			List<Client> clients, String name) {
		this.menuitems = menuitem;
		this.employees = employee;
		this.clients = clients;
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
		for (int j = 0; j < i; j++) {
			if (j < 3) {
				waiters.get(0).getTables().add(tablesforDay.get(j));
			} else if (j < 6) {
				waiters.get(1).getTables().add(tablesforDay.get(j));
			} else
				waiters.get(2).getTables().add(tablesforDay.get(j));
		}
		this.tables = tablesforDay;
		System.out.println(i + " tables assigned to waitresses!");
	}

	public void populateTables() {
		Random r = new Random();
		for (Table t : tables) {
			int r1 = r.nextInt(18);
			int r2 = r.nextInt(18);
			while (r2 == r1)
				r2 = r.nextInt(18);
			t.getClients().add(clients.get(r1));
			t.getClients().add(clients.get(r2));
		}
		System.out.println("Tables have been populated by clients");
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

	public void acceptOrders() {
		orders = new ArrayList<Order>();
		Random r = new Random();
		for (Table t : tables) {
			for (Client c : t.getClients()) {
				ArrayList<MenuItem> menuChoice = new ArrayList<MenuItem>();
				int dish = r.nextInt(5);
				int beverage = r.nextInt(5) + 5;
				menuChoice.add(menuitems.get(dish));
				menuChoice.add(menuitems.get(beverage));
				Order order = new Order(c, menuChoice);
				orders.add(order);
			}
		}
	}
}
