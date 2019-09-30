package mvcPackage;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	private LinkedHashMap <String, String> countryOptions;
	private String favLang;
	private String os[];
	
	public Student() {
		countryOptions = new LinkedHashMap<String, String>();
		countryOptions.put("Fr","france");
		countryOptions.put("DE","Germany");
		countryOptions.put("Jo","Jordan");
		countryOptions.put("In","India");
		countryOptions.put("US","United State of Amireca");
				
	}
	
	
	public String[] getOs() {
		return os;
	}

	public void setOs(String[] os) {
		this.os = os;
	}

	public String getFavLang() {
		return favLang;
	}

	public void setFavLang(String favLang) {
		this.favLang = favLang;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}



	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	
	
}
