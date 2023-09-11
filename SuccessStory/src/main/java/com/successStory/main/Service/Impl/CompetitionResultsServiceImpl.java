package com.successStory.main.Service.Impl;

import java.util.List;

import org.hibernate.annotations.FetchProfile.FetchOverride;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.successStory.main.Dto.CompetitionResultsDtoToEntity;
import com.successStory.main.Entities.CompetitionResults;
import com.successStory.main.Payloads.CompetitionResultsDto;
import com.successStory.main.Repositories.CompetitionResultsRepo;
import com.successStory.main.Service.CompetitionResultsService;

@Service
public class CompetitionResultsServiceImpl implements CompetitionResultsService {

	private final CompetitionResultsRepo competitionResultsRepo;
	private final CompetitionResultsDtoToEntity competitionResultsDtoToEntity;
	
	@Autowired
	public CompetitionResultsServiceImpl(CompetitionResultsRepo competitionResultsRepo,
			CompetitionResultsDtoToEntity competitionResultsDtoToEntity) {
		super();
		this.competitionResultsRepo = competitionResultsRepo;
		this.competitionResultsDtoToEntity = competitionResultsDtoToEntity;
	}
	
	@Override
	public CompetitionResultsDto addCompetitionResult(CompetitionResultsDto competitionResultsDto) {
		
		CompetitionResults competitionResults = competitionResultsDtoToEntity.dtoToCompetitionResults(competitionResultsDto);
		competitionResults = competitionResultsRepo.save(competitionResults);
		competitionResultsDto = competitionResultsDtoToEntity.competitionResultsToDto(competitionResults);
		return competitionResultsDto;
	}
	
	@Override
	public 	List<CompetitionResultsDto> getAllCompetitionResults(){
		List<CompetitionResults> competitonResults = this.findByStudentName(null)
	}

}
