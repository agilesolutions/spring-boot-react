package ch.agilesolutions.jdo.model;

public class MailSession {
	
	private String smtpServer;
	
	private Boolean smtpSSL;
	
	private String smtpUserName;
	
	private Integer smtpPort;
	
	private String name;
	
	private String smtpPassword;
	
	private Boolean debugSwitch;
	
	private String fromAddress;
	
	private Integer id;
	
	private Integer version;
	
	private String smtpName;
	
	private String jndiName;

	public String getSmtpServer() {
		return smtpServer;
	}
	public void setSmtpServer(String smtpServer) {
		this.smtpServer = smtpServer;
	}
	public Boolean getSmtpSSL() {
		return smtpSSL;
	}
	public void setSmtpSSL(Boolean smtpSSL) {
		this.smtpSSL = smtpSSL;
	}
	public String getSmtpUserName() {
		return smtpUserName;
	}
	public void setSmtpUserName(String smtpUserName) {
		this.smtpUserName = smtpUserName;
	}
	public Integer getSmtpPort() {
		return smtpPort;
	}
	public void setSmtpPort(Integer smtpPort) {
		this.smtpPort = smtpPort;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSmtpPassword() {
		return smtpPassword;
	}
	public void setSmtpPassword(String smtpPassword) {
		this.smtpPassword = smtpPassword;
	}
	public Boolean getDebugSwitch() {
		return debugSwitch;
	}
	public void setDebugSwitch(Boolean debugSwitch) {
		this.debugSwitch = debugSwitch;
	}
	public String getFromAddress() {
		return fromAddress;
	}
	public void setFromAddress(String fromAddress) {
		this.fromAddress = fromAddress;
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
	public String getSmtpName() {
		return smtpName;
	}
	public void setSmtpName(String smtpName) {
		this.smtpName = smtpName;
	}
	public String getJndiName() {
		return jndiName;
	}
	public void setJndiName(String jndiName) {
		this.jndiName = jndiName;
	}
	
	
}
