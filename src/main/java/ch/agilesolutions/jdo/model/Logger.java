package ch.agilesolutions.jdo.model;

import ch.agilesolutions.jdo.annotations.Attribute;
import ch.agilesolutions.jdo.annotations.WidgetType;


public class Logger {
	
	private Boolean parent;
	
	private String logLevel;
	
	private String name;
	
	private String handler;
	
	private Integer id;
	
	private Integer version;

	@Attribute(order = 1, length = 30, required=true, type = WidgetType.INPUT)	
	public String getName() {
		return name;
	}
	@Attribute(order = 2, length = 10, required=true, type = WidgetType.INPUT)	
	public String getLogLevel() {
		return logLevel;
	}
	@Attribute(order = 3, length = 25, required=true, type = WidgetType.LIST)
	public String getHandler() {
		return handler;
	}


	
	public Boolean getParent() {
		return parent;
	}
	public void setParent(Boolean parent) {
		this.parent = parent;
	}
	public void setLogLevel(String logLevel) {
		this.logLevel = logLevel;
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
	
	public void setHandler(String handler) {
		this.handler = handler;
	}
	public String getDescription() {
		return String.format("%s on level  %s", name,logLevel);
	}
	@Override
	public String toString() {
		return this.name;
	}

	
}
