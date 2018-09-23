package ch.agilesolutions.jdo.model;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.gson.annotations.Expose;


public class ReferenceData {
	@Expose(serialize = true)
	private List<String> formatters = new ArrayList<>();
	
	@Expose(serialize = true)
	private List<String> levels = new ArrayList<>();
	
	@Expose(serialize = true)
	private List<String> handlertypes = new ArrayList<>();
	
	@Expose(serialize = true)
	private Map<String,String> environments = new HashMap<>();
	
	@Expose(serialize = true)
	private List<String> runtimes = new ArrayList<>();
	
	@Expose(serialize = true)
	private List<String> machines = new ArrayList<>();

	public List<String> getFormatters() {
		return formatters;
	}

	public List<String> getLevels() {
		return levels;
	}

	public Map<String, String> getEnvironments() {
		return environments;
	}

	public List<String> getHandlertypes() {
		return handlertypes;
	}

	public List<String> getRuntimes() {
		return runtimes;
	}

	public void setRuntimes(List<String> runtimes) {
		this.runtimes = runtimes;
	}

	public List<String> getMachines() {
		return machines;
	}

	public void setMachines(List<String> machines) {
		this.machines = machines;
	}
	
	
	
}
