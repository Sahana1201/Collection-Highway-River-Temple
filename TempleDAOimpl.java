package com.xworkz.datastore.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.xworkz.datastore.dto.TempleDTO;

public class TempleDAOimpl implements TempleDAO {

	private List<TempleDTO> list = new ArrayList<TempleDTO>();

	@Override
	public boolean save(TempleDTO dto) {
		boolean added = list.add(dto);
		System.out.println("dto :" + dto);
		System.out.println("dto was added " + added);
		return added;
	}

	@Override
	public int totalItems() {
		int total = list.size();
		return total;
	}

	@Override
	public boolean delete(TempleDTO dto) {
		if (this.list.contains(dto)) {
			System.out.println("rempved " + dto);
			return this.list.remove(dto);
		}
		System.out.println("temple not exist, cannot remove");
		return false;
	}

	@Override
	public TempleDTO findFirstItem() {
		Iterator<TempleDTO> itr = this.list.iterator();

		return itr.next();
	}

	@Override
	public TempleDTO findLastItem() {
		Iterator<TempleDTO> itr = this.list.iterator();
		TempleDTO lastItem = null;
		while (itr.hasNext()) {
			lastItem = itr.next();
		}
		return lastItem;

	}

	@Override
	public TempleDTO findByName(String name) {
		TempleDTO dto = null;
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			if (templeDTO.getName().equals(name)) {
				dto = templeDTO;
				break;
			}
		}
		return dto;
	}

	@Override
	public TempleDTO findByLocation(String location) {
		TempleDTO dto = null;
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			if (templeDTO.getLocation().equals(location)) {
				dto = templeDTO;
				break;
			}
		}
		return dto;
	}

	@Override
	public TempleDTO findByLocationAndName(String name, String location) {
		TempleDTO dto = null;
		Iterator<TempleDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			TempleDTO templeDTO = itr.next();
			if (templeDTO.getName().equals(name) && (templeDTO.getLocation().equals(location))) {
				dto = templeDTO;
				break;
			}
		}
		return dto;
	}

	@Override
	public Collection<TempleDTO> findAll() {

		return null;
	}

	@Override
	public Collection<TempleDTO> findAllTemple() {

		return null;
	}

	@Override
	public Collection<String> findAllLocations() {
		Iterator<TempleDTO> alllocation = this.list.iterator();
		while (alllocation.hasNext()) {
			TempleDTO findalllocation = alllocation.next();
			System.out.println("findall location : " + findalllocation.getLocation());
		}

		return null;

	}

	@Override
	public Collection<TempleDTO> findAllTempleByEntryFeeGreaterThan(double cost) {
		TempleDTO dto = null;
		Iterator<TempleDTO> entryFeeGreaterThan = this.list.iterator();
		while (entryFeeGreaterThan.hasNext()) {
			TempleDTO dt = entryFeeGreaterThan.next();
			if (dt.getEntreFee() > cost) {
				System.out.println("Entry fee greater than : " + dt);
			}
		}
		return null;

	}

}
