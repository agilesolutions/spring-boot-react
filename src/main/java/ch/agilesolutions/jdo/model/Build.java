package ch.agilesolutions.jdo.model;

public class Build {
	private String releaseTag;
	private String name;
	private Boolean defaultBuild;
	private String description;
	private Integer id;

	public String getReleaseTag() {
		return releaseTag;
	}
	public void setReleaseTag(String releaseTag) {
		this.releaseTag = releaseTag;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Boolean getDefaultBuild() {
		return defaultBuild;
	}
	public void setDefaultBuild(Boolean defaultBuild) {
		this.defaultBuild = defaultBuild;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
}
