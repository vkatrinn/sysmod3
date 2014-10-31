import hw3.Experience;

/**
 * @(#) Employee.java
 */

public class Employee
{
	private Player player;
	
	private Restaurant restaurant;
	
	private String name;
	
	private String surname;
	
	private int salary;
	
	private Experience experience;
	
	public void ComputeSalary( )
	{
		
	}
	
	public void IncreaseExperience( )
	{
		
	}
	
	public void setName( String name )
	{
		this.name=name;
	}
	
	public String getName( )
	{
		return name;
	}
	
	public void setSurname( String surname )
	{
		this.surname=surname;
	}
	
	public String getSurname( )
	{
		return surname;
	}
	
	public void setSalary( int salary )
	{
		this.salary=salary;
	}
	
	public int getSalary( )
	{
		return salary;
	}
	
	public void setExperience( Experience experience )
	{
		this.experience=experience;
	}
	
	public Experience getExperience( )
	{
		return experience;
	}
	
	
}
