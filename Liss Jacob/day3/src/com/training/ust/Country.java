package com.training.ust;

public class Country {
	private String countryId;
	private String countryName;
	public Country(String countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
	}
	public String getCountryId() {
		return countryId;
	}
	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	@Override
    public boolean equals(Object obj) { 
        Country s = (Country) obj; 
        return this.countryId.equals(s.countryId) && this.countryName.equals(s.countryName); 
    } 

}
