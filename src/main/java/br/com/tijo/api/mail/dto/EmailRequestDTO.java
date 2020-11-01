package br.com.tijo.api.mail.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class EmailRequestDTO {

	@SerializedName("email")
	@JsonProperty("email")	
	private String email;
	@SerializedName("userName")
	@JsonProperty("userName")	
	private String userName;
	@SerializedName("tempPsw")
	@JsonProperty("tempPsw")	
	private String tempPsw;

	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}

	
	public String getTempPsw() {
		return tempPsw;
	}
	public void setTempPsw(String tempPsw) {
		this.tempPsw = tempPsw;
	}
}
