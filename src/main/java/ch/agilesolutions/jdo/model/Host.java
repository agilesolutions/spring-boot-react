package ch.agilesolutions.jdo.model;

public class Host {
	
	private Boolean loadBalanced;
	
	private Boolean productive;
	
	private Build build;
	
	private String domain;
	
	private String name;
	
	private String description;
	
	private Integer id;
	
	private Boolean exportHomeLink;

	public Boolean getLoadBalanced() {
		return loadBalanced;
	}
	public void setLoadBalanced(Boolean loadBalanced) {
		this.loadBalanced = loadBalanced;
	}
	public Boolean getProductive() {
		return productive;
	}
	public void setProductive(Boolean productive) {
		this.productive = productive;
	}
	public Build getBuild() {
		return build;
	}
	public void setBuild(Build build) {
		this.build = build;
	}
	public String getDomain() {
		return domain;
	}
	public void setDomain(String domain) {
		this.domain = domain;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public Boolean getExportHomeLink() {
		return exportHomeLink;
	}
	public void setExportHomeLink(Boolean exportHomeLink) {
		this.exportHomeLink = exportHomeLink;
	}
	
	
}
