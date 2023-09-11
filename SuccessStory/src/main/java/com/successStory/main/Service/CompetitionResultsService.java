package com.successStory.main.Service;

import java.util.List;

import com.successStory.main.Payloads.CompetitionResultsDto;

public interface CompetitionResultsService {

	CompetitionResultsDto addCompetitionResult(CompetitionResultsDto competitionResultsDto);
	List<CompetitionResultsDto> getAllCompetitionResults();
	List<CompetitionResultsDto>findByStudentName(String studentName);
	CompetitionResultsDto updateCompetitionResults(CompetitionResultsDto competitionResultsDto, String studentName);
	boolean deleteAllCompetitionResults();
	boolean deleteSingleCompetitionResults(String studentName);
}
