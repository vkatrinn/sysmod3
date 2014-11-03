import hw3.Quality;

/**
 * @(#) Dish.java
 */
public class Dish extends MenuItem {
	private int calorieCount;

	public Dish( String name, int calorieCount, Quality quality ) {
		this.name = name;
		this.calorieCount = calorieCount;
		this.quality = quality;
	}

	public void setCalorieCount( int calorieCount ) {
		this.calorieCount = calorieCount;
	}

	public int getCalorieCount( ) {
		return calorieCount;
	}

	@Override
	public int computeProductionPrice( ) {
		if (this.getQuality().equals(Quality.HIGH))
			return 10;
		else
			return 3;
	}
}
