package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eMajor;

public class Student_Test {
	
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
	public void main() throws PersonException{		
		
		Date date = new Date();
		Course Course1 = new Course(UUID.randomUUID(), "Math", 100);
		Course Course2 = new Course(UUID.randomUUID(), "English", 100);
		Course Course3 = new Course(UUID.randomUUID(), "Science", 100);
		
		ArrayList<Course> Courses = new ArrayList<Course>();
		Courses.add(Course1);
		Courses.add(Course2);
		Courses.add(Course3);
		
		Semester Fall = new Semester(UUID.randomUUID(), date, date);
		Semester Spring = new Semester(UUID.randomUUID(), date, date);
		
		ArrayList<Semester> Semesters = new ArrayList<Semester>();
		Semesters.add(Fall);
		Semesters.add(Spring);
		
		Section Section1F = new Section(Course1.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 1);
		Section Section1S = new Section(Course1.getCourseID(), Spring.getSemesterID(), UUID.randomUUID(), 1);
		Section Section2F = new Section(Course1.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 1);
		Section Section2S = new Section(Course1.getCourseID(), Spring.getSemesterID(), UUID.randomUUID(), 1);
		Section Section3F = new Section(Course1.getCourseID(), Fall.getSemesterID(), UUID.randomUUID(), 1);
		Section Section3S = new Section(Course1.getCourseID(), Spring.getSemesterID(), UUID.randomUUID(), 1);

		ArrayList<Section> Sections = new ArrayList<Section>();
		Sections.add(Section1F);
		Sections.add(Section1S);
		Sections.add(Section2F);
		Sections.add(Section2S);
		Sections.add(Section3F);
		Sections.add(Section3S);
		
		Student S1 = new Student("Greg", "Robert", "Paulson", date, eMajor.NURSING, "Home",
				"(610)-(777)-(8765)", "email@email.com" );
		Student S2 = new Student("Greg", "Robert", "Paulson", date, eMajor.NURSING, "Home",
				"(610)-(777)-(8765)", "email@email.com" );
		Student S3 = new Student("Greg", "Robert", "Paulson", date, eMajor.NURSING, "Home",
				"(610)-(777)-(8765)", "email@email.com" );
		Student S4 = new Student("Greg", "Robert", "Paulson", date, eMajor.NURSING, "Home",
				"(610)-(777)-(8765)", "email@email.com" );
		Student S5 = new Student("Greg", "Robert", "Paulson", date, eMajor.NURSING, "Home",
				"(610)-(777)-(8765)", "email@email.com" );
		Student S6 = new Student("Greg", "Robert", "Paulson", date, eMajor.NURSING, "Home",
				"(610)-(777)-(8765)", "email@email.com" );
		Student S7 = new Student("Greg", "Robert", "Paulson", date, eMajor.NURSING, "Home",
				"(610)-(777)-(8765)", "email@email.com" );
		Student S8 = new Student("Greg", "Robert", "Paulson", date, eMajor.NURSING, "Home",
				"(610)-(777)-(8765)", "email@email.com" );
		Student S9 = new Student("Greg", "Robert", "Paulson", date, eMajor.NURSING, "Home",
				"(610)-(777)-(8765)", "email@email.com" );
		Student S10 = new Student("Greg", "Robert", "Paulson", date, eMajor.NURSING, "Home",
				"(610)-(777)-(8765)", "email@email.com" );
		
		ArrayList<Student> Students = new ArrayList<Student>();
		Students.add(S1);
		Students.add(S2);
		Students.add(S3);
		Students.add(S4);
		Students.add(S5);
		Students.add(S6);
		Students.add(S7);
		Students.add(S8);
		Students.add(S9);
		Students.add(S10);
		
		
		//Even numbered enrollments belong to one student, odd numbered ones to another
		Enrollment E1 = new Enrollment(UUID.randomUUID(), Section1F.getSectionID());
		Enrollment E2 = new Enrollment(UUID.randomUUID(), Section1S.getSectionID());
		Enrollment E3 = new Enrollment(UUID.randomUUID(), Section2F.getSectionID());
		Enrollment E4 = new Enrollment(UUID.randomUUID(), Section2S.getSectionID());
		Enrollment E5 = new Enrollment(UUID.randomUUID(), Section3F.getSectionID());
		Enrollment E6 = new Enrollment(UUID.randomUUID(), Section3S.getSectionID());
		Enrollment E7 = new Enrollment(UUID.randomUUID(), Section1F.getSectionID());
		Enrollment E8 = new Enrollment(UUID.randomUUID(), Section1S.getSectionID());
		Enrollment E9 = new Enrollment(UUID.randomUUID(), Section2F.getSectionID());
		Enrollment E10 = new Enrollment(UUID.randomUUID(), Section2S.getSectionID());
		Enrollment E11 = new Enrollment(UUID.randomUUID(), Section3F.getSectionID());
		Enrollment E12 = new Enrollment(UUID.randomUUID(), Section3S.getSectionID());
		
		E1.setGrade(50);
		E2.setGrade(100);
		E3.setGrade(20);
		E4.setGrade(70);
		E5.setGrade(50);
		E6.setGrade(100);
		E7.setGrade(20);
		E8.setGrade(70);
		E9.setGrade(50);
		E10.setGrade(100);
		E11.setGrade(20);
		E12.setGrade(70);
		
		double student1average = (E1.getGrade()+E3.getGrade()+E5.getGrade()+E7.getGrade()+E9.getGrade()+E11.getGrade())/6;
		double student2average = (E2.getGrade()+E4.getGrade()+E6.getGrade()+E8.getGrade()+E10.getGrade()+E12.getGrade())/6;
		
		assertEquals(student1average, 35);

	}
	
}
