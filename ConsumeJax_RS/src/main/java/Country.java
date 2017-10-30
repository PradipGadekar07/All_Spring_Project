
public class Country {

	private String countryName;
	private String countryCode1;
	private String countryCode2;

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryCode1() {
		return countryCode1;
	}

	public void setCountryCode1(String countryCode1) {
		this.countryCode1 = countryCode1;
	}

	public String getCountryCode2() {
		return countryCode2;
	}

	public void setCountryCode2(String countryCode2) {
		this.countryCode2 = countryCode2;
	}

	@Override
	public String toString() {
		return "\nCountry [countryName=" + countryName + ", countryCode1=" + countryCode1 + ", countryCode2="
				+ countryCode2 + "]";
	}

}
