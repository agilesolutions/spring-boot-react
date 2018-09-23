package ch.agilesolutions.jdo.model;

import java.util.ArrayList;
import java.util.List;

import ch.agilesolutions.jdo.annotations.Attribute;
import ch.agilesolutions.jdo.annotations.WidgetType;

public class Datasource {
	private Integer id;
	
	private String name;
	
	private String datasourceClass;
	
	private String password;
	
	private String driver;
	
	private Boolean distributed;
	
	private String userName;
	
	private Integer version;
	
	private String url;
	
	private String jndiName;
	
	
	private List<DatasourceProperty> properties = new ArrayList<>();

	@Attribute(order = 4, length = 50, required=true, type = WidgetType.INPUT)	
	public String getDatasourceClass() {
		return datasourceClass;
	}

	public void setDatasourceClass(String datasourceClass) {
		this.datasourceClass = datasourceClass;
	}

	@Attribute(order = 6, length = 25, required=true, type = WidgetType.PASSWORD)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Attribute(order = 7, length = 25, required=true, type = WidgetType.LIST)
	public String getDriver() {
		return driver;
	}

	public void setDriver(String driver) {
		this.driver = driver;
	}

	@Attribute(order = 1, length = 50, required=true, type = WidgetType.INPUT)
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getDistributed() {
		return distributed;
	}

	public void setDistributed(Boolean distributed) {
		this.distributed = distributed;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Attribute(order = 5, length = 25, required=true, type = WidgetType.INPUT)
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Attribute(order = 3, length = 100, required=true, type = WidgetType.INPUT)
	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
	
	public List<DatasourceProperty> getProperties() {
		return properties;
	}

	public void setProperties(List<DatasourceProperty> properties) {
		this.properties = properties;
	}

	@Attribute(order = 2, length = 40, required=true, type = WidgetType.INPUT)
	public String getJndiName() {
		return jndiName;
	}

	public void setJndiName(String jndiName) {
		this.jndiName = jndiName;
	}

	public String getDescription() {
		return String.format("%s at %s", name,url);
	}

	@Override
	public String toString() {
		return this.name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((url == null) ? 0 : url.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Datasource other = (Datasource) obj;
		if (url == null) {
			if (other.url != null)
				return false;
		} else if (!url.equals(other.url))
			return false;
		return true;
	}

	
	
}
