package courses;

public class Address {

	private int street_number;
	private String street_name;
	private String city;
	private String state;
	private String country;

	public Address() {

	}

	public Address(String street_name, int street_number, String city, String state, String country) {
		this.street_name = street_name;
		this.street_number = street_number;
		this.city = city;
		this.state = state;
		this.country = country;
	}

	public int getStreet_number() {
		return street_number;
	}

	public void setStreet_number(int street_number) {
		this.street_number = street_number;
	}

	public String getStreet_name() {
		return street_name;
	}

	public void setStreet_name(String street_name) {
		this.street_name = street_name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String toString() {

		String address = "Street Name:" + this.street_name + " Street Number:" + +this.street_number + " City:"
				+ this.city + " State:" + this.state + " Country:" + this.country;

		return address;

	}

}
