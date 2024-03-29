package com.cisc181.core;


import java.util.UUID;

public class Course {

	private UUID CourseID;
	private String CourseName;
	private int GradePoints;
	
	public Course(UUID CourseID, String CourseName, int GradePoints){
		this.CourseID = CourseID;
		this.CourseName = CourseName;
		this.GradePoints = GradePoints;
	}
	
	public void setCourseID(UUID CourseID){
		this.CourseID = CourseID;
	}
	
	public void setCourseName(String CourseName){
		this.CourseName = CourseName;
	}
	
	public void setGradePoints(int GradePoints){
		this.GradePoints = GradePoints;
	}
	
	public UUID getCourseID(){
		return CourseID;
	}
	
	public String getCourseName(){
		return CourseName;
	}
	
	public int getGradePoints(){
		return GradePoints;
	}
}
