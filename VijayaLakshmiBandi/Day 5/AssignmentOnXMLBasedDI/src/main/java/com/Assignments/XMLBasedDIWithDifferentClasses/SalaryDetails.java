package com.Assignments.XMLBasedDIWithDifferentClasses;

public class SalaryDetails {
	private double annualSalary;

	@Override
	public String toString() {
		return "SalaryDetails [annualSalary=" + String.valueOf(annualSalary) + "]";
	}

	public double getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
}
