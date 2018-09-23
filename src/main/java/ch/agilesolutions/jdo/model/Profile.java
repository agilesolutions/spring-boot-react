package ch.agilesolutions.jdo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
	
@Entity
public class Profile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String name;
	
	private String hostName;
	
	private String domain;
	
	private String prefix;
	
	private String jdk;
	
	private String description;
	
	private Integer buildNumber;
	
	private Host host;
	
	private String environment;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="profile")
	@JsonIgnore
	private List<SystemProperty> systemProperties;
	
	public List<SystemProperty> getSystemProperties() {
		return systemProperties;
	}


	public void setSystemProperties(List<SystemProperty> systemProperties) {
		this.systemProperties = systemProperties;
	}


	public Profile() {}


	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHostName() {
		return hostName;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getJdk() {
		return jdk;
	}

	public void setJdk(String jdk) {
		this.jdk = jdk;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getBuildNumber() {
		return buildNumber;
	}

	public void setBuildNumber(Integer buildNumber) {
		this.buildNumber = buildNumber;
	}

	public Host getHost() {
		return host;
	}

	public void setHost(Host host) {
		this.host = host;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	
}
