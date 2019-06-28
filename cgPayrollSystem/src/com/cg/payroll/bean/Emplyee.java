package com.cg.payroll.bean;
public class Emplyee {
private int id;
private String  firstName,LastName,Email,Desgn,pancard,department;
private BankDetails bankDetails;
private SalaryAccount salaryAccount;
public Emplyee(){}
public Emplyee(int id, String firstName, String lastName, String email, String desgn, String pancard,
		String department, BankDetails bankDetails, SalaryAccount salaryAccount) {
	super();
	this.id = id;
	this.firstName = firstName;
	LastName = lastName;
	Email = email;
	Desgn = desgn;
	this.pancard = pancard;
	this.department = department;
	this.bankDetails = bankDetails;
	this.salaryAccount = salaryAccount;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getDesgn() {
	return Desgn;
}
public void setDesgn(String desgn) {
	Desgn = desgn;
}
public String getPancard() {
	return pancard;
}
public void setPancard(String pancard) {
	this.pancard = pancard;
}
public String getDepartment() {
	return department;
}
public void setDepartment(String department) {
	this.department = department;
}
public BankDetails getBankDetails() {
	return bankDetails;
}
public void setBankDetails(BankDetails bankDetails) {
	this.bankDetails = bankDetails;
}
public SalaryAccount getSalaryAccount() {
	return salaryAccount;
}
public void setSalaryAccount(SalaryAccount salaryAccount) {
	this.salaryAccount = salaryAccount;
}
}


