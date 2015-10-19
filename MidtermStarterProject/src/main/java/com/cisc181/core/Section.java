package com.cisc181.core;

import java.util.UUID;

public class Section {
	private Course course = new Course();
	private UUID CourseId = course.getCourseID();
	private Semester semester = new Semester();
	private UUID SemesterID = semester.getSemesterID();
	private UUID SectionID;
	private int RoomID;
	
	public UUID getCourseId() {
		return CourseId;
	}
	public void setCourseId(UUID courseId) {
		CourseId = courseId;
	}
	public UUID getSemesterID() {
		return SemesterID;
	}
	public void setSemesterID(UUID semesterID) {
		SemesterID = semesterID;
	}
	public UUID getSectionID() {
		return SectionID;
	}
	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	public int getRoomID() {
		return RoomID;
	}
	public void setRoomID(int roomID) {
		RoomID = roomID;
	}
	
	
}
