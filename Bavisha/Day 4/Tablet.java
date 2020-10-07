package day4Files;

import java.util.Date;

public class Tablet {

	private String tabletName;
	private String manufacturer;
	private Date manufactureDate;  
	private Date expiryDate;
	public String getTabletName() {
		return tabletName;
	}
	public void setTabletName(String tabletName) {
		this.tabletName = tabletName;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public Date getManufactureDate() {
		return manufactureDate;
	}
	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	public Tablet(String tabletName, String manufacturer, Date manufactureDate, Date expiryDate) {
		super();
		this.tabletName = tabletName;
		this.manufacturer = manufacturer;
		this.manufactureDate = manufactureDate;
		this.expiryDate = expiryDate;
	}
	public Tablet() {
		// TODO Auto-generated constructor stub
	}
	public Tablet(String[] datas) {
		// TODO Auto-generated constructor stub
	}
	
}
