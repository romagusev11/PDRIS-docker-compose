package com.example.consumingrest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Ping {

	private Long id;
	private String response;

	public Ping() {
	}

	public Long getId() {
		return this.id;
	}

	public String getResponse() {
		return this.response;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setResponse(String response) {
		this.response = response;
	}

	@Override
	public String toString() {
		return "Ping{" +
				"id=" + id +
				", response='" + response + '\'' +
				'}';
	}
}