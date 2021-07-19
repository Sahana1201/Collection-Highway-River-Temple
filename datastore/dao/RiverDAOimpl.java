package com.xworkz.datastore.dao;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.datastore.dto.RiverDTO;

public class RiverDAOimpl implements RiverDAO {

	private List<RiverDTO> list = new ArrayList<RiverDTO>();

	@Override
	public boolean save(RiverDTO dto) {

		boolean added = list.add(dto);
		System.out.println(dto);
		System.out.println("Dto was added" + dto);

		return added;
	}

	@Override
	public int totalItems() {
		int total = list.size();
		return total;
	}

	@Override
	public void update(RiverDTO dto) {
		boolean exist = this.list.contains(dto);
		if (exist) {
			System.out.println("River found Will update" + dto);
			int indexOfRiver = this.list.lastIndexOf(dto);
			this.list.set(indexOfRiver, dto);
		} else {
			System.out.println("River Not Found");
		}
	}

	@Override
	public boolean delete(RiverDTO dto) {

		if (this.list.contains(dto)) {
			System.out.println("Removed " + dto);
			return this.list.remove(dto);
		}
		System.out.println("River not exist, cant remove");
		return false;
	}

}
