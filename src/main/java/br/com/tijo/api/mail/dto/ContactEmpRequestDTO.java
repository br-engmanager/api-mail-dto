package br.com.tijo.api.mail.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.gson.annotations.SerializedName;

public class ContactEmpRequestDTO {

	@SerializedName("email")
	@JsonProperty("email")	
	private String email;
	@SerializedName("name")
	@JsonProperty("name")	
	private String name;
	@SerializedName("empresa")
	@JsonProperty("empresa")	
	private String empresa;
	@SerializedName("telefone")
	@JsonProperty("telefone")	
	private String telefone;

	
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
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	
	
	
	
	
}
