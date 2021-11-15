package com.api.model;

public class ExtraData {
private String bankName;
private  String bankCode;
public String getBankName() {
	return bankName;
}
public void setBankName(String bankName) {
	this.bankName = bankName;
}
public String getBankCode() {
	return bankCode;
}
public void setBankCode(String bankCode) {
	this.bankCode = bankCode;
}
public ExtraData(String bankName, String bankCode) {
	super();
	this.bankName = bankName;
	this.bankCode = bankCode;
}
@Override
public String toString() {
	return "ExtraData [bankName=" + bankName + ", bankCode=" + bankCode + ", getBankName()=" + getBankName()
			+ ", getBankCode()=" + getBankCode() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}

}
