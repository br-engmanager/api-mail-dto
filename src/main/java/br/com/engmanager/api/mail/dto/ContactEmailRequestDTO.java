package br.com.engmanager.api.mail.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class ContactEmailRequestDTO {

	@SerializedName("email")
	@JsonProperty("email")	
	private String email;
	@SerializedName("name")
	@JsonProperty("name")	
	private String name;
	@SerializedName("message")
	@JsonProperty("message")	
	private String message;

	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	
	
	
	
	
}
