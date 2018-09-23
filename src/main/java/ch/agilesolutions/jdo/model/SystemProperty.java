package ch.agilesolutions.jdo.model;

import ch.agilesolutions.jdo.annotations.Attribute;
import ch.agilesolutions.jdo.annotations.WidgetType;


public class SystemProperty {
	
	private Integer id;
	
	private String name;
	
	private Integer version;
	
	private String value;

	@Attribute(order = 1, length = 60, required=true, type = WidgetType.INPUT)	
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
	@Attribute(order = 2, length = 60, required=true, type = WidgetType.INPUT)	
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
