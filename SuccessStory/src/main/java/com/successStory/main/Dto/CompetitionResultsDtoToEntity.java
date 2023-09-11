package com.successStory.main.Dto;

import org.springframework.stereotype.Component;

import com.successStory.main.Entities.CompetitionResults;
import com.successStory.main.Payloads.CompetitionResultsDto;

@Component
public class CompetitionResultsDtoToEntity {

	public CompetitionResults dtoToCompetitionResults(CompetitionResultsDto competitionResultsDto) {
		
		 CompetitionResults competitionResults = new CompetitionResults();
		 
		 competitionResults.setStudentName(competitionResultsDto.getStudentName());
		 competitionResults.setSchoolName(competitionResultsDto.getSchoolName());
		 competitionResults.setCompetition(competitionResultsDto.getCompetition());
		 competitionResults.setScore1(competitionResultsDto.getScore1());
		 competitionResults.setStatus(competitionResultsDto.isStatus());
		 
		 return competitionResults;
	}
	
	public CompetitionResultsDto competitionResultsToDto(CompetitionResults competitionResults) {
		
		CompetitionResultsDto competitionResultsDto = new CompetitionResultsDto();
		
		competitionResultsDto.setStudentName(competitionResults.getStudentName());
		competitionResultsDto.setSchoolName(competitionResults.getSchoolName());
		competitionResultsDto.setCompetition(competitionResults.getCompetition());
		competitionResultsDto.setScore1(competitionResults.getScore1());
		competitionResultsDto.setStatus(competitionResults.isStatus());
		
		return competitionResultsDto;
	}
	
}
