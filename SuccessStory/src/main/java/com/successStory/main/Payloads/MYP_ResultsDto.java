package com.successStory.main.Payloads;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class MYP_ResultsDto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String Student_Name;
	private String School_Name;
	private int Year;
	private String Levels;
	private String Score1;
	boolean Status;
	
	}
