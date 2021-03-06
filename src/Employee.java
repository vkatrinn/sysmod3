import hw3.Experience;

/**
 * @(#) Employee.java
 */
public abstract class Employee implements Comparable<Employee> {
	private String name;

	private String surname;

	private Experience experience;

	public int computeSalary( ) {
		int additionalSalary = 0;
		if (this.experience.equals(Experience.LOW)) {
			additionalSalary = 200;
		}
		if (this.experience.equals(Experience.MEDIUM)) {
			additionalSalary = 300;
		}
		if (this.experience.equals(Experience.HIGH)) {
			additionalSalary = 400;
		}
		return additionalSalary;
	}

	public Employee( String name, String surname, Experience experience ) {
		this.name = name;
		this.surname = surname;
		this.experience = experience;
	}

	public void increaseExperience( ) {
		if (this.experience.equals(Experience.LOW)) {
			this.experience = Experience.MEDIUM;
		} else if (this.experience.equals(Experience.MEDIUM)) {
			this.experience = Experience.HIGH;
		}
	}

	public void setName( String name ) {
		this.name = name;
	}

	public String getName( ) {
		return name;
	}

	public void setSurname( String surname ) {
		this.surname = surname;
	}

	public String getSurname( ) {
		return surname;
	}

	public void setExperience( Experience experience ) {
		this.experience = experience;
	}

	public Experience getExperience( ) {
		return experience;
	}

	public abstract int getCostOfTraining( );

	@Override
	public int compareTo( Employee o ) {
		if (this.experience.equals(o.experience))
			return 0;
		if ((this.experience.equals(Experience.LOW) && (o.experience
				.equals(Experience.MEDIUM) || o.experience
				.equals(Experience.HIGH)))
				|| (this.experience.equals(Experience.MEDIUM) && o.experience
						.equals(Experience.HIGH)))
			return 1;
		else
			return -1;
	}

}