package com.xworkz.datastore.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.xworks.groups_constants.HighwayType;
import com.xworkz.datastore.dto.HighwayDTO;
import com.xworkz.datastore.dto.TempleDTO;

public class HighwayDAOImpl implements HighwayDAO {

	private List<HighwayDTO> list = new ArrayList<HighwayDTO>();

	@Override
	public boolean save(HighwayDTO dto) {
		boolean added = list.add(dto);
		System.out.println("dto :" + dto);
		System.out.println("dto was added " + added);
		return added;
	}

	@Override
	public Collection<HighwayDTO> findAll() {

		return list;
	}

	@Override
	public Collection<HighwayDTO> findAllNumber() {
		Collection<HighwayDTO> tempcollection = new ArrayList<HighwayDTO>();
		Iterator<HighwayDTO> highwayByid = this.list.iterator();
		while (highwayByid.hasNext()) {
			HighwayDTO number = highwayByid.next();
			System.out.println("AllNumbers:-" + number.getNumber());
			tempcollection.add(number);
		}

		return tempcollection;
	}

	@Override
	public int totalItems() {
		int total = list.size();
		return total;
	}

	@Override
	public Collection<HighwayDTO> findByHighWayType(HighwayType type) {

		Collection<HighwayDTO> tempcollection = new ArrayList<HighwayDTO>();
		Iterator<HighwayDTO> highwayType = this.list.iterator();
		while (highwayType.hasNext()) {
			HighwayDTO highwaytype = highwayType.next();

			if (highwaytype.getHighwayType().equals(type))

				tempcollection.add(highwaytype);
		}

		return tempcollection;
	}

	@Override
	public boolean exist(HighwayDTO dto) {

		return this.list.contains(dto);
	}

	@Override
	public boolean isCondition(int number) {
		double dto = 0;
		Iterator<HighwayDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			HighwayDTO highwayDTO = itr.next();
			if (highwayDTO.getNumber() == number) {

				return highwayDTO.isCondition();
			}
		}

		return false;

	}

	@Override
	public Collection<HighwayDTO> findByStateName(String name) {

		Collection<HighwayDTO> tempcollection = new ArrayList<HighwayDTO>();
		Iterator<HighwayDTO> stateName = this.list.iterator();
		while (stateName.hasNext()) {
			HighwayDTO statename = stateName.next();

			if (statename.getStateName().equals(name))

				tempcollection.add(statename);
		}

		return tempcollection;

	}

	@Override
	public double findLengthByNumber(int no) {
		Iterator<HighwayDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			HighwayDTO highwayDTO = itr.next();
			if (highwayDTO.getNumber() == no) {
				return highwayDTO.getLength();
			}
		}
		System.out.println("no such number");
		return 0;

	}

	@Override
	public boolean delete(HighwayDTO dto) {
		if (this.list.contains(dto)) {
			System.out.println("removed highway is  " + dto);
			return this.list.remove(dto);
		}
		System.out.println("Highway not exist, cannot remove");
		return false;
	}

	@Override
	public Collection<Integer> findNumberByStateName(String sname) {
		Collection<Integer> collection = new ArrayList<>();
		Iterator<HighwayDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			HighwayDTO highwayDTO = itr.next();
			if (highwayDTO.getStateName().equals(sname)) {
				collection.add(highwayDTO.getNumber());
			}
		}
		return collection;
	}

	@Override
	public HighwayDTO findByMaxLength() {
		Iterator<HighwayDTO> itr = this.list.iterator();
		HighwayDTO dto = itr.next();
		while (itr.hasNext()) {
			double length = dto.getLength();
			HighwayDTO highwayDTO = itr.next();
			if (highwayDTO.getLength() > length) {
				System.out.println("---found by maximum length---");
				dto = highwayDTO;
			}
		}
		return dto;
	}

	@Override
	public HighwayDTO findByMinLength() {
		Iterator<HighwayDTO> itr = this.list.iterator();
		HighwayDTO dto = itr.next();
		while (itr.hasNext()) {
			double length = dto.getLength();
			HighwayDTO highwayDTO = itr.next();
			if (highwayDTO.getLength() < length) {
				System.out.println("---found by mainimum length---");
				dto = highwayDTO;
			}
		}
		return dto;

	}

}
