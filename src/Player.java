/**
 * @(#) Player.java
 */
public class Player {
	private RankingList rankinglist;

	private Restaurant restaurant;

	private MenuItem menuitem;

	private String name;

	private int score;

	private Employee employee;

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
