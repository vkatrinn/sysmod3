import java.util.ArrayList;

/**
 * @(#) GameController.java
 */
public class GameController {
	private Restaurant restaurant;

	private Player player;

	public void ChooseName(String name) {
		this.player.setName(name);
	}

	public GameController(ArrayList<MenuItem> menu,
			ArrayList<Employee> employees) {
		this.player = new Player();
		this.restaurant = new Restaurant(menu, employees, "Restaurant");
	}

	public void TrainEmployee(Employee employee) {
		if (restaurant.getBudget() > employee.getCostOfTraining()) {
			employee.IncreaseExperience();
			restaurant.setBudget(restaurant.getBudget()
					- employee.getCostOfTraining());
			System.out
					.println("Employee training successful! Remaining budget is "
							+ restaurant.getBudget());
		} else
			System.out.println("Not enough money to train!");
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public void SetFoodPrice(int lowBcost, int highBcost, int highDcost,
			int lowDcost) {

	}

}
