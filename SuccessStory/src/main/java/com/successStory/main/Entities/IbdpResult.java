package com.successStory.main.Entities;
import org.springframework.data.relational.core.mapping.Table;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table("Ibdp_Result")
public class IbdpResult {
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int Student_id;
	
	@Column(name = "studentName")
    private String studentName;
	private String School_Name;
	private int Year;
	private String Level;
    //@Type(type = "fraction")
	private String Score;
    //@Type(type = "fraction", value = null)

	private String IA_Score;
	private boolean Status;
	
	public IbdpResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IbdpResult(int student_id, String studentName, String school_Name, int year, String level, String score,
			String iA_Score, boolean status) {
		super();
		Student_id = student_id;
		this.studentName = studentName;
		School_Name = school_Name;
		Year = year;
		Level = level;
		Score = score;
		IA_Score = iA_Score;
		Status = status;
	}
		
}