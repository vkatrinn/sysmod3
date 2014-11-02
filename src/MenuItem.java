import hw3.Quality;

/**
 * @(#) MenuItem.java
 */
public abstract class MenuItem {
	private String name;

	private Quality quality;

	private int price;

	public abstract int ComputeProductionPrice( );

	public void setName( String name ) {
		this.name = name;
	}

	public String getName( ) {
		return name;
	}

	public void setQuality( Quality quality ) {
		this.quality = quality;
	}

	public Quality getQuality( ) {
		return quality;
	}

	public void setPrice( int price ) {
		this.price = price;
	}

	public int getPrice( ) {
		return price;
	}

}
