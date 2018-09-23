package ch.agilesolutions.jdo.model;

import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import ch.agilesolutions.jdo.annotations.Attribute;
import ch.agilesolutions.jdo.annotations.WidgetType;
import ch.agilesolutions.jdo.domain.Owner;


public class SystemProperty {
	
	private Integer id;
	
	private String name;
	
	private Integer version;
	
	private String value;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "profile")
	private Profile profile;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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

	public String getDescription() {
		return String.format("name = %s and value = %s", name,value);
	}

	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return this.name;
	}


}
