package com.successStory.main.Entities;
import org.springframework.data.relational.core.mapping.Table;

import com.successStory.main.Dto.IbdpResultFractionDto;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
@Table
public class IbdpResult {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int id;
	private String Student_Name;
	private String School_Name;
	private int Year;
	private String Level;
    //@Type(type = "fraction")
	private IbdpResultFractionDto Score;
    //@Type(type = "fraction", value = null)

	private IbdpResultFractionDto IA_Score;
	private boolean Status;
	
	public IbdpResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IbdpResult(int id, String student_Name, String school_Name, int year, String level, IbdpResultFractionDto score,
			IbdpResultFractionDto iA_Score, boolean status) {
		super();
		id = id;
		Student_Name = student_Name;
		School_Name = school_Name;
		Year = year;
		Level = level;
		Score = score;
		IA_Score = iA_Score;
		Status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		id = id;
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