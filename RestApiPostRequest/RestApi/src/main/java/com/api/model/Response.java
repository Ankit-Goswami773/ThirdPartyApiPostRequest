package com.api.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {

	private AuthStatus authStatus;

private List<Results> results;

@Override
public String toString() {
	return "Response [authStatus=" + authStatus + ", results=" + results + "]";
}
public List<Results> getResults() {
	return results;
}
public void setResults(List<Results> results) {
	this.results = results;
}


public Response(AuthStatus authStatus, List<Results> results) {
	super();
	this.authStatus = authStatus;
	this.results = results;
}
public AuthStatus getAuthStatus() {
	return authStatus;
}
public void setAuthStatus(AuthStatus authStatus) {
	this.authStatus = authStatus;
}
public Response() {
	super();
	// TODO Auto-generated constructor stub
}



}
