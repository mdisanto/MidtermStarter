package com.cisc181.core;

import com.cisc181.eNums.eTitle;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Staff_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test

	public void main() throws PersonException {
		Date date = new Date();

		Staff Mascaro = new Staff("Bret", "James", "Mascaro", date, "House", "(610)-888-5643", "email@mail.com", "6-9",
				9, 1.0, date, eTitle.Professor);

		Staff Sarver = new Staff("Heidi", "I", "Sarver", date, "House", "(610)-888-5643", "email@mail.com", "6-9", 9,
				2.0, date, eTitle.Professor);

		Staff Benton = new Staff("Robert", "James", "Benton", date, "House", "(610)-888-5643", "email@mail.com", "6-9",
				9, 3.0, date, eTitle.Professor);

		Staff Leonard = new Staff("Brian", "James", "Leonard", date, "House", "(610)-888-5643", "email@mail.com", "6-9",
				9, 4.0, date, eTitle.Professor);

		Staff Bugosh = new Staff("Bri", "Jamie", "Bugosh", date, "House", "(610)-888-5643", "email@mail.com", "6-9", 9,
				5.0, date, eTitle.Professor);

		ArrayList<Staff> Staff = new ArrayList<Staff>();

		Staff.add(Mascaro);
		Staff.add(Sarver);
		Staff.add(Benton);
		Staff.add(Leonard);
		Staff.add(Bugosh);

		double sal = 0;
		int counter = 0;
		for (int i = 0; i < Staff.size(); i++) {
			counter++;
			sal = Staff.get(i).getSalary() + sal;
		}

		double average = sal / counter;
		
		System.out.print(average);

		assertTrue(average == 3.0);
	}

	@Test(expected = PersonException.class)
	public void ExceptionTest1() throws PersonException {
		Date date = new Date();
		date.setYear(date.getYear()-120);

		Staff Mascaro = new Staff("Bret", "James", "Mascaro", date, "House", "(610)-888-5643", "email@mail.com", "6-9",
				9, 1.0, date, eTitle.Professor);
	}
	
	@Test(expected = PersonException.class)
	public void ExceptionTest2() throws PersonException {
		Date date = new Date();

		Staff Mascaro = new Staff("Bret", "James", "Mascaro", date, "House", "610877885643", "email@mail.com", "6-9",
				9, 1.0, date, eTitle.Professor);
	}

}


