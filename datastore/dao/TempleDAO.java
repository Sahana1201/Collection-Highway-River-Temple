package com.xworkz.datastore.dao;

import java.util.Collection;

import com.xworkz.datastore.dto.TempleDTO;

public interface TempleDAO {

	boolean save(TempleDTO dto);

	int totalItems();

	boolean delete(TempleDTO dto);

	TempleDTO findFirstItem();

	TempleDTO findLastItem();

	TempleDTO findByName(String name);

	TempleDTO findByLocation(String location);

	TempleDTO findByLocationAndName(String name, String location);

	Collection<TempleDTO> findAll();

	Collection<TempleDTO> findAllTemple();

	Collection<TempleDTO> findAllLocations();

	Collection<TempleDTO> findAllTempleByEntryFeeGreaterThan(double cost);

	Collection<TempleDTO> findAllTempleByLocationStartWith(char charecter);

	Collection<TempleDTO> findAllTempleByNoOfPoojarisGreaterThan(int no);

	String findLocationByName(String name);

}
