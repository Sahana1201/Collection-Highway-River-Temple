package com.xworkz.datastore;

import com.xworkz.datastore.dao.RiverDAO;
import com.xworkz.datastore.dao.RiverDAOimpl;
import com.xworkz.datastore.dto.RiverDTO;

public class RiverDAOTester {

	public static void main(String[] args) {
		RiverDTO dto = new RiverDTO("Kaveri", "Thalkaveri", 805, 4, true);
		RiverDTO dto1 = new RiverDTO("Sharavati", "Ambutirtha", 120, 1, true);
		RiverDTO dto2 = new RiverDTO("Krishna", "Mahabaleshwar", 805, 1, true);

		RiverDAO dao = new RiverDAOimpl();
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);

		System.out.println("Total Items:-" + dao.totalItems());

		RiverDTO kaveriUpdated = new RiverDTO("Kaveri", "Thalkaveri", 806, 4, true);
		dao.update(kaveriUpdated);
		System.out.println("Total Items:-" + dao.totalItems());

		RiverDTO dtoToDelete = new RiverDTO("Sharavati", "Thalkaveri", 806, 1, true);
		dao.delete(dtoToDelete);
		System.out.println("Total Items:-" + dao.totalItems());

	}

}
