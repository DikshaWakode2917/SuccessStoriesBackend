package com.successStory.main.Payloads;

public class IGCSE_ResultsDto {

	private String StudentName;
	private String Student_School;
	private int Year;
	private String Extented;
	private String Additional;
	private String International;
	boolean Status;
	
	public IGCSE_ResultsDto() {
		super();
	}

	public IGCSE_ResultsDto(String studentName, String student_School, int year, String extented, String additional,
			String international, boolean status) {
		super();
		StudentName = studentName;
		Student_School = student_School;
		Year = year;
		Extented = extented;
		Additional = additional;
		International = international;
		Status = status;
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
