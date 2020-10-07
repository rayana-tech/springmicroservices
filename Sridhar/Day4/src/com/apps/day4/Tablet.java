package com.apps.day4;

import java.time.LocalDate;

public class Tablet {
private String tabletname;
private String manufacturer;
private LocalDate manufacturedate;
private LocalDate expirydate;
public Tablet(String tabletname, String manufacturer, LocalDate manufacturedate, LocalDate expirydate) {
	super();
	this.tabletname = tabletname;
	this.manufacturer = manufacturer;
	this.manufacturedate = manufacturedate;
	this.expirydate = expirydate;
}

public String getTabletname() {
	return tabletname;
}
public void setTabletname(String tabletname) {
	this.tabletname = tabletname;
}
public String getManufacturer() {
	return manufacturer;
}
public void setManufacturer(String manufacturer) {
	this.manufacturer = manufacturer;
}
public LocalDate getManufacturedate() {
	return manufacturedate;
}
public void setManufacturedate(LocalDate manufacturedate) {
	this.manufacturedate = manufacturedate;
}
public LocalDate getExpirydate() {
	return expirydate;
}
public void setExpirydate(LocalDate expirydate) {
	this.expirydate = expirydate;
}

}
