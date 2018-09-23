package ch.agilesolutions.jdo.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
	
@Entity
public class Profile {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	private String name;
	
	private String hostName;
	
	private String description;
	
	private String environment;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "domain")
	private Domain domain;

	


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

	public Domain getDomain() {
		return domain;
	}


	public void setDomain(Domain domain) {
		this.domain = domain;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Profile(String name, String hostName, String description, String environment, Domain domain) {
		super();
		this.name = name;
		this.hostName = hostName;
		this.description = description;
		this.environment = environment;
		this.domain = domain;
	}


	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	
}
