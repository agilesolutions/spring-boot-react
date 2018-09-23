package ch.agilesolutions.jdo.model;

import ch.agilesolutions.jdo.annotations.Attribute;
import ch.agilesolutions.jdo.annotations.WidgetType;

public class Deployment {
	
	private String name;
	
	private String artifact;
	
	private String groupIdentification;
	
	private Integer id;
	
	private Integer versionnumber;
	
	private String type;
	
	private String version;

	@Attribute(order = 2, length = 40, required=true, type = WidgetType.INPUT)
	public String getArtifact() {
		return artifact;
	}

	public void setArtifact(String artifact) {
		this.artifact = artifact;
	}

	@Attribute(order = 1, length = 80, required=true, type = WidgetType.INPUT)
	public String getGroupIdentification() {
		return groupIdentification;
	}

	public void setGroupIdentification(String groupIdentification) {
		this.groupIdentification = groupIdentification;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getVersionnumber() {
		return versionnumber;
	}

	public void setVersionnumber(Integer versionnumber) {
		this.versionnumber = versionnumber;
	}

	@Attribute(order = 3, length = 4, required=true, type = WidgetType.INPUT)
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Attribute(order = 4, length = 10, required=true, type = WidgetType.INPUT)
	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return String.format("%s.%s-%s",groupIdentification, artifact, version);
	}

	@Override
	public String toString() {
		return this.artifact;
	}

	
	
}
