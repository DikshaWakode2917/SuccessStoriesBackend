package com.successStory.main.Payloads;

import org.apache.commons.math3.fraction.Fraction;

import com.successStory.main.Dto.IbdpResultFractionDto;

public class IbdpResultDto {

	private String Student_Name;
	private String School_Name;
	private int Year;
	private String Level;
	private IbdpResultFractionDto Score;
	private IbdpResultFractionDto IA_Score;
	private boolean Status;
	public IbdpResultDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public IbdpResultDto(String student_Name, String school_Name, int year, String level, IbdpResultFractionDto score,
			IbdpResultFractionDto iA_Score, boolean status) {
		super();
		Student_Name = student_Name;
		School_Name = school_Name;
		Year = year;
		Level = level;
		Score = score;
		IA_Score = iA_Score;
		Status = status;
	}
	public String getStudent_Name() {
		return Student_Name;
	}
	public void setStudent_Name(String student_Name) {
		Student_Name = student_Name;
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
	public IbdpResultFractionDto getScore() {
		return Score;
	}
	public void setScore(IbdpResultFractionDto score) {
		Score = score;
	}
	public IbdpResultFractionDto getIA_Score() {
		return IA_Score;
	}
	public void setIA_Score(IbdpResultFractionDto iA_Score) {
		IA_Score = iA_Score;
	}
	public boolean isStatus() {
		return Status;
	}
	public void setStatus(boolean status) {
		Status = status;
	}
	
		
}
