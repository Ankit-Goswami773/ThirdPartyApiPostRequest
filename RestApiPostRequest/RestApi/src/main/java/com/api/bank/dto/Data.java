package com.api.bank.dto;

import java.util.List;

public class Data {
	@Override
	public String toString() {
		return "Data [status=" + status + ", code=" + code + ", data=" + data + "]";
	}

	private String status;
	private String code;
	private List<BankDto> data;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<BankDto> getData() {
		return data;
	}

	public void setData(List<BankDto> data) {
		this.data = data;
	}

	public Data(String status, String code, List<BankDto> data) {
		super();
		this.status = status;
		this.code = code;
		this.data = data;
	}

	public Data() {
		super();
		// TODO Auto-generated constructor stub
	}

}
