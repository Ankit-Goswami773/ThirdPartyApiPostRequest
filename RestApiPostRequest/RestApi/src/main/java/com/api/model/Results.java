package com.api.model;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Results {

	private int statusCode;
   private String statusDescription;
   private int totalAmount;
   private int totalTransactionCharges;     
   private int transactionCharges[];
   private int chargeRequestID;
   private long chargeRequestUUID;
public int getStatusCode() {
	return statusCode;
}
public void setStatusCode(int statusCode) {
	this.statusCode = statusCode;
}
public String getStatusDescription() {
	return statusDescription;
}
public void setStatusDescription(String statusDescription) {
	this.statusDescription = statusDescription;
}
public int getTotalAmount() {
	return totalAmount;
}
public void setTotalAmount(int totalAmount) {
	this.totalAmount = totalAmount;
}
public int getTotalTransactionCharges() {
	return totalTransactionCharges;
}
public void setTotalTransactionCharges(int totalTransactionCharges) {
	this.totalTransactionCharges = totalTransactionCharges;
}
public int[] getTransactionCharges() {
	return transactionCharges;
}
public void setTransactionCharges(int[] transactionCharges) {
	this.transactionCharges = transactionCharges;
}
public int getChargeRequestID() {
	return chargeRequestID;
}
public void setChargeRequestID(int chargeRequestID) {
	this.chargeRequestID = chargeRequestID;
}
public long getChargeRequestUUID() {
	return chargeRequestUUID;
}
public void setChargeRequestUUID(int chargeRequestUUID) {
	this.chargeRequestUUID = chargeRequestUUID;
}
public Results(int statusCode, String statusDescription, int totalAmount, int totalTransactionCharges,
		int[] transactionCharges, int chargeRequestID, long chargeRequestUUID) {
	super();
	this.statusCode = statusCode;
	this.statusDescription = statusDescription;
	this.totalAmount = totalAmount;
	this.totalTransactionCharges = totalTransactionCharges;
	this.transactionCharges = transactionCharges;
	this.chargeRequestID = chargeRequestID;
	this.chargeRequestUUID = chargeRequestUUID;
}
@Override
public String toString() {
	return "Results [statusCode=" + statusCode + ", statusDescription=" + statusDescription + ", totalAmount="
			+ totalAmount + ", totalTransactionCharges=" + totalTransactionCharges + ", transactionCharges="
			+ Arrays.toString(transactionCharges) + ", chargeRequestID=" + chargeRequestID + ", chargeRequestUUID="
			+ chargeRequestUUID + "]";
}
public Results() {
	super();
	// TODO Auto-generated constructor stub
}
	
   
}
