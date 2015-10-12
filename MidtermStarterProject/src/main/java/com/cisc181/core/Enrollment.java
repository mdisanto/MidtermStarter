package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	private UUID EnrollmentID;
	private UUID StudentID;
	private UUID SectionID;
	private double Grade;
	
	private Enrollment(){
		this.EnrollmentID = UUID.randomUUID();
	}

	public Enrollment(UUID StudentID, UUID SectionID){
		this.StudentID = StudentID;
		this.SectionID = SectionID;
		this.EnrollmentID = UUID.randomUUID();
	}
	
	public void setEnrollment(UUID EnrollmentID){
		this.EnrollmentID = EnrollmentID;
	}
	
	public void setStudentID(UUID StudentID){
		this.StudentID = StudentID;
	}
	
	public void setSectionID(UUID SectionID){
		this.SectionID = SectionID;
	}
	
	public void setGrade(double Grade){
		this.Grade = Grade;
	}
	
	public UUID getEnrollment(){
		return EnrollmentID;
	}
	
	public UUID getStudentID(){
		return StudentID;
	}
	
	public UUID getSectionID(){
		return SectionID;
	}
	
	public double getGrade(){
		return Grade;
	}
}
