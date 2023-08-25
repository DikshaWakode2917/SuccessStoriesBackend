package com.successStory.main.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@AllArgsConstructor
@Getter
@Setter
public class IGCSE_Results {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Student_id;
	
	private String Student_Name;
	private String Strudent_School;
	private int Year;
	private String Extented;
	private String Additional;
	private String International;
	boolean Status;
	
	public IGCSE_Results() {
		super();
	}
	
}
