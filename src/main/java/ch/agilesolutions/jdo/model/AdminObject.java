package ch.agilesolutions.jdo.model;

import ch.agilesolutions.jdo.annotations.Attribute;
import ch.agilesolutions.jdo.annotations.WidgetType;


public class AdminObject {
	private String name;
	private String className;
	private Boolean mdb;
	private Integer id;
	private String configProperty;
	private String jndiName;
	private String description;

	@Attribute(order = 1, length = 20, required=true, type = WidgetType.INPUT)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Attribute(order = 2, length = 60, required=true, type = WidgetType.INPUT)
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	public Boolean getMdb() {
		return mdb;
	}
	public void setMdb(Boolean mdb) {
		this.mdb = mdb;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Attribute(order = 3, length = 80, required=true, type = WidgetType.INPUT)
	public String getConfigProperty() {
		return configProperty;
	}
	public void setConfigProperty(String configProperty) {
		this.configProperty = configProperty;
	}
	@Attribute(order = 4, length = 60, required=true, type = WidgetType.INPUT)
	public String getJndiName() {
		return jndiName;
	}
	public void setJndiName(String jndiName) {
		this.jndiName = jndiName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
	
}
