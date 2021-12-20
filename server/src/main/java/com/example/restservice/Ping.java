package com.example.restservice;

public class Ping {

	private final long id;
	private final String response = "Pong";

	public Ping(long id) {
		this.id = id;
	}

	public long getId() {
		return id;
	}

	public String getResponse() {
		return response;
	}
}
