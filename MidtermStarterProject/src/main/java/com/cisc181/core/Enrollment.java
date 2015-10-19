package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	
	private Section section = new Section();
	private UUID SectionID = section.getSectionID();
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	private Enrollment(){
	}
	
	public Enrollment (UUID SectionID, UUID StudentID) {
		this.SectionID = SectionID;
		this.StudentID = StudentID;
		setEnrollmentID(this.EnrollmentID);
		setGrade(this.Grade);
		
	}
	
	public UUID getSectionID() {
		return SectionID;
	}
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	public UUID getStudentID() {
		return StudentID;
	}
	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}
	public UUID getEnrollmentID() {
		return EnrollmentID;
	}
	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}
	public double getGrade() {
		return Grade;
	}
	public void setGrade(double grade) {
		Grade = grade;
	}
	

}
