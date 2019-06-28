package com.cg.payroll.bean;

public class SalaryAccount {
double basicSalary,hra,convenceAllowance,otherAllowence,personalAllowence,monthlyTax,epf,companyPF,netSalary;

public SalaryAccount(double basicSalary, double hra, double convenceAllowance, double otherAllowence,
		double personalAllowence, double monthlyTax, double epf, double companyPF, double netSalary) {
	super();
	this.basicSalary = basicSalary;
	this.hra = hra;
	this.convenceAllowance = convenceAllowance;
	this.otherAllowence = otherAllowence;
	this.personalAllowence = personalAllowence;
	this.monthlyTax = monthlyTax;
	this.epf = epf;
	this.companyPF = companyPF;
	this.netSalary = netSalary;
}

public double getBasicSalary() {
	return basicSalary;
}

public void setBasicSalary(double basicSalary) {
	this.basicSalary = basicSalary;
}

public double getHra() {
	return hra;
}

public void setHra(double hra) {
	this.hra = hra;
}

public double getConvenceAllowance() {
	return convenceAllowance;
}

public void setConvenceAllowance(double convenceAllowance) {
	this.convenceAllowance = convenceAllowance;
}

public double getOtherAllowence() {
	return otherAllowence;
}

public void setOtherAllowence(double otherAllowence) {
	this.otherAllowence = otherAllowence;
}

public double getPersonalAllowence() {
	return personalAllowence;
}

public void setPersonalAllowence(double personalAllowence) {
	this.personalAllowence = personalAllowence;
}

public double getMonthlyTax() {
	return monthlyTax;
}

public void setMonthlyTax(double monthlyTax) {
	this.monthlyTax = monthlyTax;
}

public double getEpf() {
	return epf;
}

public void setEpf(double epf) {
	this.epf = epf;
}

public double getCompanyPF() {
	return companyPF;
}

public void setCompanyPF(double companyPF) {
	this.companyPF = companyPF;
}

public double getNetSalary() {
	return netSalary;
}

public void setNetSalary(double netSalary) {
	this.netSalary = netSalary;
}
}
