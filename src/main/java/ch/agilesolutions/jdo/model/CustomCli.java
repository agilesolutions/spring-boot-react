package ch.agilesolutions.jdo.model;


import com.google.gson.annotations.Expose;


public class CustomCli {
	
	private String cli;
	
	private Integer id;
	
	private Integer version;

	public String getCli() {
		return cli;
	}
	public void setCli(String cli) {
		this.cli = cli;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	
	
}
