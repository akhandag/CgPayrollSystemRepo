package com.cg.payroll.bean;

public class BankDetails {
long accountNo;
String bankName;
String IFSC;
public BankDetails(){}
public BankDetails(long accountNo, String bankName, String iFSC) {
	super();
	this.accountNo = accountNo;
	this.bankName = bankName;
	IFSC = iFSC;
}
public long getAccountNo() {
	return accountNo;
}
public void setAccountNo(long accountNo) {
	this.accountNo = accountNo;
}
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public String getIFSC() {
	return IFSC;
}
public void setIFSC(String iFSC) {
	IFSC = iFSC;
}
}