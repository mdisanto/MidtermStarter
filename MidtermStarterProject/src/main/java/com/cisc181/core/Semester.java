package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester {

	private UUID SemesterID;
	private Date StartDate;
	private Date EndDate;
	
	public Semester(UUID SemesterID, Date StartDate, Date EndDate){
		this.SemesterID = SemesterID;
		this.StartDate = StartDate;
		this.EndDate = EndDate;
	}
	
	public void setSemesterID(UUID SemesterID){
		this.SemesterID = SemesterID;
	}
	
	public void setStartDate(Date StartDate){
		this.StartDate = StartDate;
	}
	
	public void setEndDate(Date EndDate){
		this.EndDate = EndDate;
	}
	
	public UUID getSemesterID(){
		return SemesterID;
	}
	
	public Date getStartDate(){
		return StartDate;
	}
	
	public Date getEndDate(){
		return EndDate;
	}
}
