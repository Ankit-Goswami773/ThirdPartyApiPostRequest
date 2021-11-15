package com.api.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PayloadDto {
private String countryCode;
private String function;
private Payload payload;
public String getCountryCode() {
	return countryCode;
}
public void setCountryCode(String countryCode) {
	this.countryCode = countryCode;
}
public String getFunction() {
	return function;
}
public void setFunction(String function) {
	this.function = function;
}
public Payload getPayload() {
	return payload;
}
public void setPayload(Payload payload) {
	this.payload = payload;
}
public PayloadDto(String countryCode, String function, Payload payload) {
	super();
	this.countryCode = countryCode;
	this.function = function;
	this.payload = payload;
}
@Override
public String toString() {
	return "PayloadDto [countryCode=" + countryCode + ", function=" + function + ", payload=" + payload + "]";
}



}
