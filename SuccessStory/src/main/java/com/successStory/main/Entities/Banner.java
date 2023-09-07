package com.successStory.main.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
public class Banner {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int banner_id;
	
	private String banner_heading;
	private String banner_text;
	private String button_text;
	private String button_url;
	private boolean status;
	
	public Banner() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	}
