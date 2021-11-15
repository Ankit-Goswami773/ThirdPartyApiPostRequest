package com.api.model;

import java.util.Arrays;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Packet {

	private int paymentRequestID;
	private String requestReferenceID;
	private String merchantTransactionID;
	private String requestOrigin;
	private String checkoutType;
	private String requestCode;
	@JsonProperty("MSISDN")
	private String MSISDN;
	private String originatorMSISDN;
	private String serviceCode;
	private String payerClientCode;
	private String language;
	private String accountNumber;
	private String invoiceNumber;
	private String currencyCode;
	private String amount;
	private boolean addTransactionCharge;
	private int transactionCharge[];
	private String description;
	private String paymentChannel;
	private int paymentCode;
	private ExtraData extraData;
	private String requestType;
	public int getPaymentRequestID() {
		return paymentRequestID;
	}
	public void setPaymentRequestID(int paymentRequestID) {
		this.paymentRequestID = paymentRequestID;
	}
	public String getRequestReferenceID() {
		return requestReferenceID;
	}
	public void setRequestReferenceID(String requestReferenceID) {
		this.requestReferenceID = requestReferenceID;
	}
	public String getMerchantTransactionID() {
		return merchantTransactionID;
	}
	public void setMerchantTransactionID(String merchantTransactionID) {
		this.merchantTransactionID = merchantTransactionID;
	}
	public String getRequestOrigin() {
		return requestOrigin;
	}
	public void setRequestOrigin(String requestOrigin) {
		this.requestOrigin = requestOrigin;
	}
	public String getCheckoutType() {
		return checkoutType;
	}
	public void setCheckoutType(String checkoutType) {
		this.checkoutType = checkoutType;
	}
	public String getRequestCode() {
		return requestCode;
	}
	public void setRequestCode(String requestCode) {
		this.requestCode = requestCode;
	}
	public String getMSISDN() {
		return MSISDN;
	}
	public void setMSISDN(String mSISDN) {
		MSISDN = mSISDN;
	}
	public String getOriginatorMSISDN() {
		return originatorMSISDN;
	}
	public void setOriginatorMSISDN(String originatorMSISDN) {
		this.originatorMSISDN = originatorMSISDN;
	}
	public String getServiceCode() {
		return serviceCode;
	}
	public void setServiceCode(String serviceCode) {
		this.serviceCode = serviceCode;
	}
	public String getPayerClientCode() {
		return payerClientCode;
	}
	public void setPayerClientCode(String payerClientCode) {
		this.payerClientCode = payerClientCode;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(String invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public boolean isAddTransactionCharge() {
		return addTransactionCharge;
	}
	public void setAddTransactionCharge(boolean addTransactionCharge) {
		this.addTransactionCharge = addTransactionCharge;
	}
	public int[] getTransactionCharge() {
		return transactionCharge;
	}
	public void setTransactionCharge(int[] transactionCharge) {
		this.transactionCharge = transactionCharge;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getPaymentChannel() {
		return paymentChannel;
	}
	public void setPaymentChannel(String paymentChannel) {
		this.paymentChannel = paymentChannel;
	}
	public int getPaymentCode() {
		return paymentCode;
	}
	public void setPaymentCode(int paymentCode) {
		this.paymentCode = paymentCode;
	}
	public ExtraData getExtraData() {
		return extraData;
	}
	public void setExtradata(ExtraData extraData) {
		this.extraData = extraData;
	}
	public String getRequestType() {
		return requestType;
	}
	public void setRequestType(String requestType) {
		this.requestType = requestType;
	}
	@Override
	public String toString() {
		return "Packet [paymentRequestID=" + paymentRequestID + ", requestReferenceID=" + requestReferenceID
				+ ", merchantTransactionID=" + merchantTransactionID + ", requestOrigin=" + requestOrigin
				+ ", checkoutType=" + checkoutType + ", requestCode=" + requestCode + ", MSISDN=" + MSISDN
				+ ", originatorMSISDN=" + originatorMSISDN + ", serviceCode=" + serviceCode + ", payerClientCode="
				+ payerClientCode + ", language=" + language + ", accountNumber=" + accountNumber + ", invoiceNumber="
				+ invoiceNumber + ", currencyCode=" + currencyCode + ", amount=" + amount + ", addTransactionCharge="
				+ addTransactionCharge + ", transactionCharge=" + Arrays.toString(transactionCharge) + ", description="
				+ description + ", paymentChannel=" + paymentChannel + ", paymentCode=" + paymentCode + ", extradata="
				+ extraData + ", requestType=" + requestType + ", getPaymentRequestID()=" + getPaymentRequestID()
				+ ", getRequestReferenceID()=" + getRequestReferenceID() + ", getMerchantTransactionID()="
				+ getMerchantTransactionID() + ", getRequestOrigin()=" + getRequestOrigin() + ", getCheckoutType()="
				+ getCheckoutType() + ", getRequestCode()=" + getRequestCode() + ", getMSISDN()=" + getMSISDN()
				+ ", getOriginatorMSISDN()=" + getOriginatorMSISDN() + ", getServiceCode()=" + getServiceCode()
				+ ", getPayerClientCode()=" + getPayerClientCode() + ", getLanguage()=" + getLanguage()
				+ ", getAccountNumber()=" + getAccountNumber() + ", getInvoiceNumber()=" + getInvoiceNumber()
				+ ", getCurrencyCode()=" + getCurrencyCode() + ", getAmount()=" + getAmount()
				+ ", isAddTransactionCharge()=" + isAddTransactionCharge() + ", getTransactionCharge()="
				+ Arrays.toString(getTransactionCharge()) + ", getDescription()=" + getDescription()
				+ ", getPaymentChannel()=" + getPaymentChannel() + ", getPaymentCode()=" + getPaymentCode()
				+ ", getExtradata()=" + getExtraData() + ", getRequestType()=" + getRequestType() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}
