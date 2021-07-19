package com.xworkz.datastore;

import java.util.Collections;

import com.xworks.groups_constants.HighwayType;
import com.xworkz.datastore.dao.HighwayDAO;
import com.xworkz.datastore.dao.HighwayDAOImpl;
import com.xworkz.datastore.dto.HighwayDTO;

public class HighwayTester {

	public static void main(String[] args) {

		HighwayDTO dto = new HighwayDTO(1, 18, HighwayType.NH, "AndraPradesh", 369, true, "L&T");
		HighwayDTO dto1 = new HighwayDTO(2, 20, HighwayType.SH, "Karnataka", 777, true, "RIB");

		HighwayDTO dto2 = new HighwayDTO(3, 50, HighwayType.UH, "TamilNadu", 877, false, "Ashoka builders");

		HighwayDAO dao = new HighwayDAOImpl();
		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);

		System.out.println("**********************************");
		System.out.println(dao.totalItems());

		System.out.println("**********************************");
		System.out.println(dao.findAll());

		System.out.println("**********************************");
		System.out.println(dao.findAllNumber());

		System.out.println("**********************************");
		System.out.println("stateName" + dao.findByStateName("Karnataka"));

		System.out.println("**********************************");
		System.out.println("Highwaytype" + dao.findByHighWayType(HighwayType.NH));

		System.out.println("**********************************");
		System.out.println("HighwayLengthByNumber " + dao.findLengthByNumber(20));

		System.out.println("**********************************");
		System.out.println("HighwayCOndition " + dao.isCondition(50));

		System.out.println("**********************************");
		System.out.println("Exist " + dao.exist(dto2));

		System.out.println("**********************************");
		System.out.println("findNumberByStateName" + dao.findNumberByStateName("TamilNadu"));

		System.out.println("**********************************");
		System.out.println("Maximun length " + dao.findByMaxLength());

		System.out.println("**********************************");
		System.out.println("Minimun length is " + dao.findByMinLength());

		System.out.println("**********************************");
		System.out.println("Delete highway " + dao.delete(dto));

	}

}
