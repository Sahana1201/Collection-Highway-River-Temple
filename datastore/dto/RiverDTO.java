package com.xworkz.datastore.dto;

import java.io.Serializable;

public class RiverDTO implements Serializable {
	private String name;
	private String origin;
	private double length;
	private int noOfStatesInFlow;
	private boolean hydroPlant;

	public RiverDTO() {
		super();
	}

	public RiverDTO(String name, String origin, double length, int noOfStatesInFlow, boolean hydroPlant) {
		super();
		this.name = name;
		this.origin = origin;
		this.length = length;
		this.noOfStatesInFlow = noOfStatesInFlow;
		this.hydroPlant = hydroPlant;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof RiverDTO) {
			RiverDTO other = (RiverDTO) obj;
			if (this.name.equals(other.getName()))
				return true;

		}
		return false;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public int getNoOfStatesInFlow() {
		return noOfStatesInFlow;
	}

	public void setNoOfStatesInFlow(int noOfStatesInFlow) {
		this.noOfStatesInFlow = noOfStatesInFlow;
	}

	public boolean isHydroPlant() {
		return hydroPlant;
	}

	public void setHydroPlant(boolean hydroPlant) {
		this.hydroPlant = hydroPlant;
	}

	@Override
	public String toString() {
		return "RiverDTO [name=" + name + ", origin=" + origin + ", length=" + length + ", noOfStatesInFlow="
				+ noOfStatesInFlow + ", hydroPlant=" + hydroPlant + "]";
	}

}
