package com.successStory.main.Payloads;


//import com.successStory.main.Dto.IbdpResultFractionDto;

public class IbdpResultDto {

	private String StudentName;
	private String School_Name;
	private int Year;
	private String Level;
	private String Score;
	private String IA_Score;
	private boolean Status;
	public IbdpResultDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IbdpResultDto(String studentName, String school_Name, int year, String level, String score, String iA_Score,
			boolean status) {
		super();
		StudentName = studentName;
		School_Name = school_Name;
		Year = year;
		Level = level;
		Score = score;
		IA_Score = iA_Score;
		Status = status;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getSchool_Name() {
		return School_Name;
	}
	public void setSchool_Name(String school_Name) {
		School_Name = school_Name;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	public String getLevel() {
		return Level;
	}
	public void setLevel(String level) {
		Level = level;
	}
	public String getScore() {
		return Score;
	}
	public void setScore(String score) {
		Score = score;
	}
	public String getIA_Score() {
		return IA_Score;
	}
	public void setIA_Score(String iA_Score) {
		IA_Score = iA_Score;
	}
	public boolean isStatus() {
		return Status;
	}
	public void setStatus(boolean status) {
		Status = status;
	}
	
		
}
