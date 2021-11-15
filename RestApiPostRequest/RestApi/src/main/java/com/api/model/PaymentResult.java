package com.api.model;

public class PaymentResult {
	private int responsecode;
	private String responsemessage;
	private String ussdString;
	private String trxnid;
	public int getResponsecode() {
		return responsecode;
	}
	public void setResponsecode(int responsecode) {
		this.responsecode = responsecode;
	}
	public String getResponsemessage() {
		return responsemessage;
	}
	public void setResponsemessage(String responsemessage) {
		this.responsemessage = responsemessage;
	}
	public String getUssdString() {
		return ussdString;
	}
	public void setUssdString(String ussdString) {
		this.ussdString = ussdString;
	}
	public String getTrxnid() {
		return trxnid;
	}
	public void setTrxnid(String trxnid) {
		this.trxnid = trxnid;
	}
	@Override
	public String toString() {
		return "PaymentResult [responsecode=" + responsecode + ", responsemessage=" + responsemessage + ", ussdString="
				+ ussdString + ", trxnid=" + trxnid + "]";
	}
	
	
}
