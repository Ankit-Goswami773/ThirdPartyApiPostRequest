package com.api.bank.dto;

public class BankDto {
	private String bankname;
	private String bankcode;

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getBankcode() {
		return bankcode;
	}

	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}

	public BankDto(String bankname, String bankcode) {
		super();
		this.bankname = bankname;
		this.bankcode = bankcode;
	}

	public BankDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
