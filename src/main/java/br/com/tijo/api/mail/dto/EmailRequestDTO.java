package br.com.tijo.api.mail.dto;

public class EmailRequestDTO {

	private String email;
	private String userName;
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
