package com.xworkz.datastore.dto;

import java.io.Serializable;

import com.xworks.groups_constants.HighwayType;

public class HighwayDTO implements Serializable {

	private int id;
	private int number;
	private HighwayType type;
	private String stateName;
	private int length;
	private boolean condition;
	private String contractedompany;

	public HighwayDTO() {
		super();
	}

	public HighwayDTO(int id, int number, HighwayType type, String stateName, int length, boolean condition,
			String contractedompany) {
		super();
		this.id = id;
		this.number = number;
		this.type = type;
		this.stateName = stateName;
		this.length = length;
		this.condition = condition;
		this.contractedompany = contractedompany;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public HighwayType getHighwayType() {
		return type;
	}

	public void setHighWayType(String Highwaytype) {
		this.type = type;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public boolean isCondition() {
		return condition;
	}

	public void setCondition(boolean condition) {
		this.condition = condition;
	}

	public String getContractedompany() {
		return contractedompany;
	}

	public void setContractedompany(String contractedompany) {
		this.contractedompany = contractedompany;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HighwayDTO other = (HighwayDTO) obj;
		if (condition != other.condition)
			return false;
		if (contractedompany == null) {
			if (other.contractedompany != null)
				return false;
		} else if (!contractedompany.equals(other.contractedompany))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		if (id != other.id)
			return false;
		if (length != other.length)
			return false;
		if (number != other.number)
			return false;
		if (stateName == null) {
			if (other.stateName != null)
				return false;
		} else if (!stateName.equals(other.stateName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HighwayDTO [id=" + id + ", number=" + number + ", highWayType=" + type + ", stateName=" + stateName
				+ ", length=" + length + ", condition=" + condition + ", contractedompany=" + contractedompany + "]";
	}

}
