/**
 * @(#) Player.java
 */
public class Player {

	private String name;

	private int score;

	private java.util.List<Employee> employees;

	public Player(String name) {
		super();
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getScore() {
		return score;
	}

}
