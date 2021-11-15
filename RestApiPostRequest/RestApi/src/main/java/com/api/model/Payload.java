package com.api.model;

import java.util.List;

public class Payload {

	private Credentials credentials;
    
	private List<Packet> packet;

	public List<Packet> getPacket() {
		return packet;
	}

	public void setPacket(List<Packet> packet) {
		this.packet = packet;
	}

	public Credentials getCredentials() {
		return credentials;
	}

	public void setCredentials(Credentials credentials) {
		this.credentials = credentials;
	}

	
	
	
	public Payload(Credentials credentials, List<Packet> packet) {
		super();
		this.credentials = credentials;
		this.packet = packet;
	}

	@Override
	public String toString() {
		return "Payload [credentials=" + credentials + ", packet=" + packet + "]";
	}

	


	
	
	
}
