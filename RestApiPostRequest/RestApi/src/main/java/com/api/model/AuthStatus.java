package com.api.model;

public class AuthStatus {

	private int  authStatusCode;	
	private String authStatusDescription;
	public int getAuthStatusCode() {
		return authStatusCode;
	}
	public void setAuthStatusCode(int authStatusCode) {
		this.authStatusCode = authStatusCode;
	}
	public String getAuthStatusDescription() {
		return authStatusDescription;
	}
	public void setAuthStatusDescription(String authStatusDescription) {
		this.authStatusDescription = authStatusDescription;
	}
}
