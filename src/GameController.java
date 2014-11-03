import java.util.ArrayList;
import java.util.List;
import hw3.Quality;

/**
 * @(#) GameController.java
 */
public class GameController {
	private Restaurant restaurant;

	private Player player;

	public void ChooseName( String name ) {
		this.player.setName(name);
	}

	public GameController( ArrayList<MenuItem> menu, ArrayList<Employee> employees ) {
		this.player = new Player();
		this.restaurant = new Restaurant(menu, employees, "Restaurant");
	}

	public void TrainEmployee( Employee employee ) {
		if (restaurant.getBudget() > employee.getCostOfTraining()) {
			employee.IncreaseExperience();
			restaurant.setBudget(restaurant.getBudget()
					- employee.getCostOfTraining());
		} else
			System.out.println("Not enough money to train!");
	}

	public void AssignTable( Waiter waiter, List<Table> tables ) {

	}

	public void SetDishQuality( Dish dish, Quality quality ) {

	}

	public void SetBeverageQuality( Beverage beverage, Quality quality ) {

	}

	public void SetFoodPrice( int lowBcost, int highBcost, int highDcost, int lowDcost ) {

	}

}
