package com.api.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
@Configuration
public class ApplicationProperties {

	 @Value("${charger.url}")
	  private String chargerUrl;

	 @Value("${InvokeUssdReference.url}")
	 private String InvokeUssdReference;
	 
	public String getInvokeUssdReference() {
		return InvokeUssdReference;
	}

	public void setInvokeUssdReference(String invokeUssdReference) {
		InvokeUssdReference = invokeUssdReference;
	}

	public String getChargerUrl() {
		return chargerUrl;
	}

	public void setChargerUrl(String chargerUrl) {
		this.chargerUrl = chargerUrl;
	}
	 
	 
	 
}
