package com.successStory.main.Dto;

import org.springframework.stereotype.Component;

import com.successStory.main.Entities.MYP_Results;
import com.successStory.main.Payloads.MYP_ResultsDto;

@Component
public class MYP_ResultsDtoToEntity {
	
	public MYP_Results dtoToMYP_Results(MYP_ResultsDto myp_resultsDto) {
		
		MYP_Results myp_results = new MYP_Results();
		
		myp_results.setStudent_Name(myp_resultsDto.getStudent_Name());
		myp_results.setSchool_Name(myp_resultsDto.getSchool_Name());
		myp_results.setYear(myp_resultsDto.getYear());
		myp_results.setLevels(myp_resultsDto.getLevels());
		myp_results.setScore1(myp_resultsDto.getScore1());
		myp_results.setStatus(myp_resultsDto.isStatus());
		
		return myp_results;
	}
	
	public MYP_ResultsDto myp_resultsToDto(MYP_Results myp_results) {
		
		MYP_ResultsDto myp_resultsDto = new MYP_ResultsDto();
		
		myp_resultsDto.setStudent_Name(myp_results.getStudent_Name());
		myp_resultsDto.setSchool_Name(myp_results.getSchool_Name());
		myp_resultsDto.setYear(myp_results.getYear());
		myp_resultsDto.setYear(myp_results.getYear());
		myp_resultsDto.setScore1(myp_results.getScore1());
		myp_resultsDto.setStatus(myp_results.isStatus());
		
		return myp_resultsDto;
	}
}
