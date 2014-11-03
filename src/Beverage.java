import hw3.Quality;

/**
 * @(#) Beverage.java
 */
public class Beverage extends MenuItem {
	private int volume;

	public Beverage(String name, int volume, Quality quality) {
		this.name = name;
		this.volume = volume;
		this.quality = quality;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public int getVolume() {
		return volume;
	}

	@Override
	public int computeProductionPrice() {
		if (this.getQuality().equals(Quality.HIGH))
			return 3;
		else
			return 1;
	}

}
