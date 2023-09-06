package com.successStory.main.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class IGCSE_Results {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Student_id;
	
	@Column(name = "StudentName")
	private String StudentName;
	private String Student_School;
	private int Year;
	private String Extented;
	private String Additional;
	private String International;
	boolean Status;
	
	public IGCSE_Results() {
		super();
	}

	public IGCSE_Results(int student_id, String studentName, String student_School, int year, String extented,
			String additional, String international, boolean status) {
		super();
		Student_id = student_id;
		StudentName = studentName;
		Student_School = student_School;
		Year = year;
		Extented = extented;
		Additional = additional;
		International = international;
		Status = status;
	}

	public int getStudent_id() {
		return Student_id;
	}

	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getStudent_School() {
		return Student_School;
	}

	public void setStudent_School(String student_School) {
		Student_School = student_School;
	}

	public int getYear() {
		return Year;
	}

	public void setYear(int year) {
		Year = year;
	}

	public String getExtented() {
		return Extented;
	}

	public void setExtented(String extented) {
		Extented = extented;
	}

	public String getAdditional() {
		return Additional;
	}

	public void setAdditional(String additional) {
		Additional = additional;
	}

	public String getInternational() {
		return International;
	}

	public void setInternational(String international) {
		International = international;
	}

	public boolean isStatus() {
		return Status;
	}

	public void setStatus(boolean status) {
		Status = status;
	}
	
	
	
}
