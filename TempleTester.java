package com.xworkz.datastore;

import com.xworkz.datastore.dao.TempleDAO;
import com.xworkz.datastore.dao.TempleDAOimpl;
import com.xworkz.datastore.dto.TempleDTO;

public class TempleTester {

	public static void main(String[] args) {
		TempleDTO dto = new TempleDTO(1, "Anjaneya", "Bangalore", 50, "Laddu", 2, true, "anjaneya", true);

		TempleDTO dto1 = new TempleDTO(2, "DurgaDevi", "Mysore", 100, "KalluSakkare", 2, true, "Durgadevi", true);
		TempleDTO dto2 = new TempleDTO(3, "Ganesh", "Hasan", 150, "Modaka", 2, true, "Ganesh", true);
		TempleDAO dao = new TempleDAOimpl();
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		System.out.println(dao.totalItems());

		System.out.println("name and location :" + dao.findByLocationAndName("Anjaneya", "Bangalore"));
		System.out.println("found : " + dao.findByName("Anjaneya"));
		System.out.println("found : " + dao.findByLocation("Mysore"));
		System.out.println(dao.findFirstItem());
		System.out.println(dao.findLastItem());

		TempleDTO dtoToDelete = new TempleDTO(1, "Anjaneya", "Bangalore", 50, "Laddu", 2, true, "anjaneya", true);
		dao.delete(dtoToDelete);
		System.out.println(dao.findAllLocations());
		System.out.println(dao.findAll());

	}

}
