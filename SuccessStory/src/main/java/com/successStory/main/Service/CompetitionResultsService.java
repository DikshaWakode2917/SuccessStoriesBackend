package com.successStory.main.Service;

import java.util.List;

import com.successStory.main.Payloads.CompetitionResultsDto;
import com.successStory.main.Service.Impl.ResourceNotFoundException;

public interface CompetitionResultsService {

	CompetitionResultsDto addCompetitionResult(CompetitionResultsDto competitionResultsDto);
	List<CompetitionResultsDto> getAllCompetitionResults();
	List<CompetitionResultsDto>findByStudentName(String studentName);
	CompetitionResultsDto updateCompetitionResults(CompetitionResultsDto competitionResultsDto, String studentName) throws ResourceNotFoundException;
	boolean deleteAllCompetitionResults();
	boolean deleteSingleCompetitionResults(String studentName);
}
