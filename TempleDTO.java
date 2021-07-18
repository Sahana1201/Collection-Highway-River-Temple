package com.xworkz.datastore.dto;

import java.io.Serializable;

public class TempleDTO implements Serializable {

	private int id;
	private String name;
	private String location;
	private int entreFee;
	private String specialPrasada;
	private int noOfPoojaris;
	private boolean male;
	private String mainGod;
	private boolean kalyani;

	TempleDTO() {

	}

	public TempleDTO(int id, String name, String location, int entreFee, String specialPrasada, int noOfPoojaris,
			boolean male, String mainGod, boolean kalyani) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.entreFee = entreFee;
		this.specialPrasada = specialPrasada;
		this.noOfPoojaris = noOfPoojaris;
		this.male = male;
		this.mainGod = mainGod;
		this.kalyani = kalyani;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getEntreFee() {
		return entreFee;
	}

	public void setEntreFee(int entreFee) {
		this.entreFee = entreFee;
	}

	public String getSpecialPrasada() {
		return specialPrasada;
	}

	public void setSpecialPrasada(String specialPrasada) {
		this.specialPrasada = specialPrasada;
	}

	public int getNoOfPoojaris() {
		return noOfPoojaris;
	}

	public void setNoOfPoojaris(int noOfPoojaris) {
		this.noOfPoojaris = noOfPoojaris;
	}

	public boolean isMale() {
		return male;
	}

	public void setMale(boolean male) {
		this.male = male;
	}

	public String getMainGod() {
		return mainGod;
	}

	public void setMainGod(String mainGod) {
		this.mainGod = mainGod;
	}

	public boolean isKalyani() {
		return kalyani;
	}

	public void setKalyani(boolean kalyani) {
		this.kalyani = kalyani;
	}

	@Override
	public String toString() {
		return "TempleDTO [id=" + id + ", name=" + name + ", location=" + location + ", entreFee=" + entreFee
				+ ", specialPrasada=" + specialPrasada + ", noOfPoojaris=" + noOfPoojaris + ", male=" + male
				+ ", mainGod=" + mainGod + ", kalyani=" + kalyani + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TempleDTO other = (TempleDTO) obj;
		if (entreFee != other.entreFee)
			return false;
		if (id != other.id)
			return false;
		if (kalyani != other.kalyani)
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (mainGod == null) {
			if (other.mainGod != null)
				return false;
		} else if (!mainGod.equals(other.mainGod))
			return false;
		if (male != other.male)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (noOfPoojaris != other.noOfPoojaris)
			return false;
		if (specialPrasada == null) {
			if (other.specialPrasada != null)
				return false;
		} else if (!specialPrasada.equals(other.specialPrasada))
			return false;
		return true;
	}

}