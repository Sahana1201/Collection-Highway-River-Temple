package com.xworkz.datastore;

import java.util.Collection;

import com.xworkz.datastore.dao.TempleDAO;
import com.xworkz.datastore.dao.TempleDAOimpl;
import com.xworkz.datastore.dto.TempleDTO;

public class TempleTester {

	public static void main(String[] args) {
		TempleDTO dto = new TempleDTO(1, "Anjaneya", "Bangalore", 50, "Laddu", 3, true, "anjaneya", true);
		TempleDTO dto1 = new TempleDTO(2, "DurgaDevi", "Mysore", 200, "KalluSakkare", 2, true, "Durgadevi", true);
		TempleDTO dto2 = new TempleDTO(3, "Ganesh", "Hasan", 150, "Modaka", 2, true, "Ganesh", true);
		
		TempleDAO dao = new TempleDAOimpl();
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);
		
		System.out.println("**********************************");
		System.out.println(dao.totalItems());
		
		System.out.println("**********************************");
		System.out.println("name and location :" + dao.findByLocationAndName("Anjaneya", "Bangalore"));
		
		System.out.println("**********************************");
		System.out.println("found name : " + dao.findByName("Anjaneya"));
		
		System.out.println("**********************************");
		System.out.println("found location: " + dao.findByLocation("Mysore"));
		
		System.out.println("**********************************");
		System.out.println(dao.findFirstItem());
		
		System.out.println("**********************************");
				System.out.println(dao.findLastItem());

		// TempleDTO dtoToDelete = new TempleDTO(1, "Anjaneya", "Bangalore", 50,
		// "Laddu", 2, true, "anjaneya", true);
		// dao.delete(dtoToDelete);
		System.out.println("**********************************");
		System.out.println("All location" + dao.findAllLocations());
		System.out.println(dao.findAll());
		
		System.out.println("**********************************");
		Collection<TempleDTO> coll = dao.findAllTempleByLocationStartWith('B');
		for (TempleDTO templeDto : coll) {
			System.out.println('B');
			System.out.println("Location Starting with charecter" + templeDto);
		}
		
		System.out.println("**********************************");
		System.out.println(dao.findAllTempleByEntryFeeGreaterThan(150));
		
		System.out.println("**********************************");
		System.out.println("findLocationByName :-" + dao.findLocationByName("Ganesh"));
		
		System.out.println("**********************************");
		System.out.println("No of Poojies:-"  +dao.findAllTempleByNoOfPoojarisGreaterThan(2));
	}

}
