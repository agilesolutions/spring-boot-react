package ch.agilesolutions.jdo.model;

import java.util.ArrayList;
import java.util.List;

import ch.agilesolutions.jdo.annotations.Attribute;
import ch.agilesolutions.jdo.annotations.Component;
import ch.agilesolutions.jdo.annotations.Root;
import ch.agilesolutions.jdo.annotations.WidgetType;
	
@Root
public class Profile {
	
	private Integer id;
	
	private String name;
	
	private String hostName;
	
	private String releaseTag;
	
	private String domain;
	
	private List<Logger> loggers = new ArrayList<>();
	
	private String prefix;
	
	private String jboss;
	
	private String jdk;
	
	private String description;
	
	private Integer buildNumber;
	
	private List<SystemProperty> systemProperties = new ArrayList<>();
	
	private List<MailSession> mailSessions = new ArrayList<>();
	
	private Host host;
	
	private List<Object> securityDomains = new ArrayList<>();
	
	private CustomCli customCli;
	
	private String jiraKey;
	
	private List<QueueFactory> queueFactories = new ArrayList<>();
	
	private Integer version;
	
	private List<Module> modules = new ArrayList<>();
	
	private String component;
	
	private String environment;
	
	private List<Deployment> deployments = new ArrayList<>();
	
	private List<AlternateName> alternateNames = new ArrayList<>();
	
	private List<Object> extensions = new ArrayList<>();
	
	private List<Datasource> datasources = new ArrayList<>();
	
	private List<Handler> handlers = new ArrayList<>();
	
	private List<Argument> arguments = new ArrayList<>();
	
	private List<SocketBinding> socketBindings = new ArrayList<>();
	
	private List<Driver> drivers = new ArrayList<>();
	
	private String gitBranch;

	@Attribute(order = 1, length = 30, required=true, type = WidgetType.INPUT)
	public String getName() {
		return name;
	}
	@Attribute(order = 2, length = 90, required=true, type = WidgetType.INPUT)
	public String getDescription() {
		return description;
	}
	@Attribute(order = 3, length = 40, required=true, type = WidgetType.AUTOCOMPLETE)
	public String getDomain() {
		return domain;
	}
	@Attribute(order = 4, length = 30, required=true, type = WidgetType.LIST)
	public String getEnvironment() {
		return environment;
	}
	@Attribute(order = 5, length = 70, required=true, type = WidgetType.AUTOCOMPLETE)
	public String getHostName() {
		return hostName;
	}
	@Attribute(order = 6, length = 30, required=true, type = WidgetType.AUTOCOMPLETE)
	public String getJiraKey() {
		return jiraKey;
	}
	@Attribute(order = 7, length = 60, required=true, type = WidgetType.LIST)
	public String getJdk() {
		return jdk;
	}
	@Attribute(order = 8, length = 60, required=true, type = WidgetType.LIST)
	public String getJboss() {
		return jboss;
	}
	
	@Attribute(order = 9, length = 60, required=true, type = WidgetType.LIST)
	public String getGitBranch() {
		return gitBranch;
	}

	public void setGitBranch(String gitBranch) {
		this.gitBranch = gitBranch;
	}


	public void setName(String name) {
		this.name = name;
	}

	public void setHostName(String hostName) {
		this.hostName = hostName;
	}

	public String getReleaseTag() {
		return releaseTag;
	}

	public void setReleaseTag(String releaseTag) {
		this.releaseTag = releaseTag;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	@Component(order=7)
	public List<Logger> getLoggers() {
		return loggers;
	}

	public void setLoggers(List<Logger> loggers) {
		this.loggers = loggers;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public void setJboss(String jboss) {
		this.jboss = jboss;
	}

	public void setJdk(String jdk) {
		this.jdk = jdk;
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

	@Component(order=1)
	public List<SystemProperty> getSystemProperties() {
		return systemProperties;
	}

	public void setSystemProperties(List<SystemProperty> systemProperties) {
		this.systemProperties = systemProperties;
	}

	public List<MailSession> getMailSessions() {
		return mailSessions;
	}

	public void setMailSessions(List<MailSession> mailSessions) {
		this.mailSessions = mailSessions;
	}

	public Host getHost() {
		return host;
	}

	public void setHost(Host host) {
		this.host = host;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Object> getSecurityDomains() {
		return securityDomains;
	}

	public void setSecurityDomains(List<Object> securityDomains) {
		this.securityDomains = securityDomains;
	}

	public CustomCli getCustomCli() {
		return customCli;
	}

	public void setCustomCli(CustomCli customCli) {
		this.customCli = customCli;
	}

	public void setJiraKey(String jiraKey) {
		this.jiraKey = jiraKey;
	}

	@Component(order=4)
	public List<QueueFactory> getQueueFactories() {
		return queueFactories;
	}

	public void setQueueFactories(List<QueueFactory> queueFactories) {
		this.queueFactories = queueFactories;
	}

	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}

	public String getComponent() {
		return component;
	}

	public void setComponent(String component) {
		this.component = component;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	@Component(order=5)
	public List<Deployment> getDeployments() {
		return deployments;
	}

	public void setDeployments(List<Deployment> deployments) {
		this.deployments = deployments;
	}

	public List<AlternateName> getAlternateNames() {
		return alternateNames;
	}

	public void setAlternateNames(List<AlternateName> alternateNames) {
		this.alternateNames = alternateNames;
	}

	public List<Object> getExtensions() {
		return extensions;
	}

	public void setExtensions(List<Object> extensions) {
		this.extensions = extensions;
	}

	@Component(order=2)
	public List<Datasource> getDatasources() {
		return datasources;
	}

	public void setDatasources(List<Datasource> datasources) {
		this.datasources = datasources;
	}

	@Component(order=6)
	public List<Handler> getHandlers() {
		return handlers;
	}

	public void setHandlers(List<Handler> handlers) {
		this.handlers = handlers;
	}


	public List<Argument> getArguments() {
		return arguments;
	}

	public void setArguments(List<Argument> arguments) {
		this.arguments = arguments;
	}


	@Component(order=8)
	public List<SocketBinding> getSocketBindings() {
		return socketBindings;
	}

	public void setSocketBindings(List<SocketBinding> socketBindings) {
		this.socketBindings = socketBindings;
	}

	
	@Component(order=3)
	public List<Driver> getDrivers() {
		return drivers;
	}


	public void setDrivers(List<Driver> drivers) {
		this.drivers = drivers;
	}

}
