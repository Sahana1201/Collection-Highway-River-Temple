package com.xworkz.datastore.dao;

import java.util.Collection;

import com.xworks.groups_constants.HighwayType;
import com.xworkz.datastore.dto.HighwayDTO;
import com.xworkz.datastore.dto.TempleDTO;

public interface HighwayDAO {

	boolean save(HighwayDTO dto);

	Collection<HighwayDTO> findAll();

	Collection<HighwayDTO> findAllNumber();

	int totalItems();

	Collection<HighwayDTO> findByHighWayType(HighwayType type);

	Collection<HighwayDTO> findByStateName(String name);

	boolean exist(HighwayDTO dto);

	boolean isCondition(int number);

	double findLengthByNumber(int no);

	boolean delete(HighwayDTO dto);
	
	Collection<Integer> findNumberByStateName(String sname);
	
	HighwayDTO findByMaxLength();
	
	HighwayDTO findByMinLength();

}
