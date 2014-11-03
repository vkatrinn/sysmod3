import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @(#) RankingList.java
 */
public class RankingList {

	public RankingList(Player player, int score) throws IOException {
		File rankingList = new File("rankingList.txt");
		if (!rankingList.exists()) {
			rankingList.createNewFile();
		}
		try (PrintWriter out = new PrintWriter(new BufferedWriter(
				new FileWriter("rankingList.txt", true)))) {
			out.println(player.getName() + ": " + score);
		} catch (IOException e) {
			System.out.println("Something went wrong, score not saved, sorry!");
		}
	}

}
