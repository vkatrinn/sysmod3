/**
 * @(#) Client.java
 */
public class Client {
	private String name;

	private String surname;

	private String telephone;

	private String taxCode;

	public Client( String name, String surname, String telephone, String taxCode ) {
		this.name = name;
		this.surname = surname;
		this.telephone = telephone;
		this.taxCode = taxCode;
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

	public void setTelephone( String telephone ) {
		this.telephone = telephone;
	}

	public String getTelephone( ) {
		return telephone;
	}

	public void setTaxCode( String taxCode ) {
		this.taxCode = taxCode;
	}

	public String getTaxCode( ) {
		return taxCode;
	}

}
