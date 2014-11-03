import hw3.Experience;
import hw3.Quality;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameInstance {
	static int day = 0;
	static RankingList rankingList;
	static GameController game;
	static ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
	static ArrayList<Client> clients = new ArrayList<Client>();
	static ArrayList<Employee> employees = new ArrayList<Employee>();

	public static void main(String[] args) throws IOException {
		boolean successful = true;
		StartGame();
		rankingList = new RankingList(game.getPlayer());
		int weeklySupplyCost = 0;
		while (day < 30) {
			if (day % 7 == 0) {
				game.getRestaurant().setBudget(
						game.getRestaurant().getBudget() - weeklySupplyCost);
				game.getRestaurant().paySalaries();
			}
			if (game.getRestaurant().getBudget() < 0) {
				successful = false;
				break;
			}
			startDay();
			weeklySupplyCost += game.getRestaurant().processOrders();
		}
		game.getRestaurant().setBudget(
				game.getRestaurant().getBudget() - weeklySupplyCost - 4000);
		if (successful && game.getRestaurant().getBudget() >= 0) {
			System.out
					.println("After substracting additional costs the final budget is: "
							+ game.getRestaurant().getBudget());
			rankingList.updateRanking();
		} else {
			System.out
					.println("Unfortunately the budget is below 0 now, this means you lost! Feel free to play again");
		}
	}

	public static void startDay() throws IOException {
		System.out.println("It is day " + day + ".");
		System.out.println("Budget is currently "
				+ game.getRestaurant().getBudget() + ".");
		offerTrainingOption();
		offerFoodPriceChanging();
		System.out.println("Reputation of your restaurant is currently "
				+ game.getRestaurant().calculateReputation() + ".");
		game.getRestaurant().assignTables();
		game.getRestaurant().populateTables();
		game.getRestaurant().acceptOrders();
		day++;

	}

	public static void offerFoodPriceChanging() throws IOException {
		System.out
				.println("Would you like to change prices of itmes today? (type Y if you do)");
		String in = new BufferedReader(new InputStreamReader(System.in))
				.readLine();
		if (in.equals("Y") || in.equals("y")) {
			initiateFoodPrice();
			game.getRestaurant().setMenuitems(menuItems);
		}

	}

	public static void offerTrainingOption() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out
					.println("Do you wish to train an employee? Write N for no and Y for yes");
			String in = br.readLine();
			if (in.equals("N") || in.equals("n"))
				break;
			if (in.equals("Y") || in.equals("y")) {
				System.out.println("Which employee would you like to train?");
				int i = 1;
				for (Employee e : employees) {
					System.out.println(i + ": " + e.getName() + " "
							+ e.getSurname() + " ,current experience level: "
							+ e.getExperience());
					i++;
				}
				System.out
						.println("Specify the number of employee you would like to train");
				try {
					int indexOfEmployee = Integer.parseInt(br.readLine()) - 1;
					game.trainEmployee(employees.get(indexOfEmployee));
				} catch (NumberFormatException e) {
					System.out
							.println("That is not a suitable employee number. Did you change your mind?");
				}
			} else {
				System.out
						.println("I did not understand you. Was that a Yes (Y) or No (N)?");
			}
		}
	}

	public static void StartGame() throws IOException {
		System.out.println("Welcome to restaurant game! Choose your name:");
		String name = new BufferedReader(new InputStreamReader(System.in))
				.readLine();
		initiateMenuItemQualities();
		initiateFoodPrice();
		initiateClients();
		initiateEmployees();
		game = new GameController(menuItems, employees, clients, name);

	}

	public static void initiateMenuItemQualities() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out
				.println("For each dish and beverage in the menu, assign a quality. "
						+ "Quality is either low or high, high quality dishes will cost more to make.");
		String dish;
		for (int i = 1; i < 11; i++) {
			if (i < 6)
				dish = "Dish" + i;
			else
				dish = "Beverage" + (i - 5);
			System.out.println("Specify quality for menu item: " + dish
					+ " (0 for Low, 1 for High)");
			int in = Integer.parseInt(br.readLine());
			Quality quality = Quality.LOW;
			if (in == 1) {
				quality = Quality.HIGH;
			}
			if (i < 6)
				menuItems.add(new Dish(dish, 100, quality));
			else
				menuItems.add(new Beverage(dish, 1, quality));
		}
	}

	public static void initiateClients() {
		for (int i = 1; i < 19; i++) {
			clients.add(new Client("Client" + i, "Client" + i, "010-...", "0"));
		}
	}

	public static void initiateFoodPrice() throws IOException {
		String[] options = new String[] { "high quality dishes",
				"high quality beverages", "low quality dishes",
				"low quality beverages" };
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] prices = new int[4];
		for (int i = 0; i < 4; i++) {
			System.out.println("What should be the price for " + options[i]
					+ "?");
			try {
				prices[i] = Integer.parseInt(br.readLine());
			} catch (NumberFormatException e) {
				System.out
						.println("Input not integer number. Price will be set at 11");
				prices[i] = 11;
			}
		}
		for (int i = 0; i < 10; i++) {
			if (i < 5) {
				if (menuItems.get(i).getQuality().equals(Quality.HIGH))
					menuItems.get(i).setPrice(prices[0]);
				else
					menuItems.get(i).setPrice(prices[2]);
			} else {
				if (menuItems.get(i).getQuality().equals(Quality.HIGH))
					menuItems.get(i).setPrice(prices[1]);
				else
					menuItems.get(i).setPrice(prices[3]);
			}
		}
	}

	public static void initiateEmployees() {
		for (int i = 1; i < 4; i++) {
			employees
					.add(new Waiter("Waiter" + i, "Waiter" + i, Experience.LOW));
		}
		employees.add(new Barman("Barman", "Bearman", Experience.LOW));
		employees.add(new Chef("Chef", "Ratatouille", Experience.LOW,
				"C-H-E-E-S-E"));
	}

}
