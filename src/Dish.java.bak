import hw3.Quality;

/**
 * @(#) Dish.java
 */
public class Dish extends MenuItem {
	private int calorieCount;

	public void setCalorieCount( int calorieCount ) {
		this.calorieCount = calorieCount;
	}

	public int getCalorieCount( ) {
		return calorieCount;
	}

	@Override
	public int ComputeProductionPrice( ) {
		if (this.getQuality().equals(Quality.HIGH))
			return 10;
		else
			return 3;
	}
}
