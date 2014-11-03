import hw3.Experience;
import hw3.Quality;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class GameInstance {
	static int day;
	static GameController game;
	static ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();
	static ArrayList<Client> clients = new ArrayList<Client>();
	static ArrayList<Employee> employees = new ArrayList<Employee>();

	public static void main(String[] args) throws IOException {
		StartGame();

	}

	public static void startDay() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("It is day " + day + ".");
		while (true) {
			System.out
					.println("Do you wish to train an employee? Write N fro no and Y for yes");
			String in = br.readLine();
			if (in.equals("N") || in.equals("n"))
				break;
			if (in.equals("Y") || in.equals("y")) {

			} else {
				System.out
						.println("I did not understand you. Was that a Yes (Y) or No (N)?");
			}

		}

	}

	public static void StartGame() throws IOException {
		initiateMenuItems();
		initiateClients();
		initiateEmployees();
		game = new GameController(menuItems, employees);
	}

	public static void initiateMenuItems() throws IOException {
		String dish = "Dish1";
		System.out
				.println("For each dish and beverage in the menu, assign a quality. "
						+ "Quality is either low or high, high quality dishes will cost more to make."
						+ '\n' + "Specify quality for menu item: " + dish);
		int i = 2;
		while (i < 12) {
			if (i < 6)
				dish = "Dish" + i;
			else
				dish = "Beverage" + (i - 5);
			int q = System.in.read();
			Quality quality = Quality.HIGH;
			if (q == 48) {
				quality = Quality.LOW;
				menuItems.add(new Dish(dish, 100, quality));
				i++;
				System.out.println("Specify quality for menu item: " + dish
						+ " (0 for Low, 1 for High)");
			}
			if (q == 49) {
				quality = Quality.HIGH;
				menuItems.add(new Dish(dish, 100, quality));
				i++;
				System.out.println("Specify quality for menu item: " + dish
						+ " (0 for Low, 1 for High)");
			}
		}
	}

	public static void initiateClients() {
		for (int i = 1; i < 19; i++) {
			clients.add(new Client("Client" + i, "Client" + i, "010-...", "0"));
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
