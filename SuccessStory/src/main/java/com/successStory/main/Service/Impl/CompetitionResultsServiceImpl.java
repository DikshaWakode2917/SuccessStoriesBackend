package com.successStory.main.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
		List<CompetitionResults> competitonResults = this.competitionResultsRepo.findAll();
		List<CompetitionResultsDto> competitionResultsDto = competitonResults.stream().map(result-> this.competitionResultsDtoToEntity.competitionResultsToDto(result)).collect(Collectors.toList());
		return competitionResultsDto;
	}
	
	@Override
	public List<CompetitionResultsDto> findByStudentName(String studentName) {
		
		Optional<CompetitionResults> competitonResults = this.competitionResultsRepo.findByStudentName(studentName);
		List<CompetitionResultsDto> competitionResultsDto = competitonResults.stream().map(result -> this.competitionResultsDtoToEntity.competitionResultsToDto(result)).collect(Collectors.toList());
		return competitionResultsDto;
	}
	
	@Override
	public 	boolean deleteAllCompetitionResults() {
		
		List<CompetitionResults> competitonResults = this.competitionResultsRepo.findAll();
		if(competitonResults.isEmpty()) {
			return false;
		}
		else this.competitionResultsRepo.deleteAll(competitonResults);
		return true;
	}
	
	@Override
	public boolean deleteSingleCompetitionResults(String studentName) {
		
		Optional<CompetitionResults> competitonResultsToDelete = this.competitionResultsRepo.findByStudentName(studentName);
		if(!competitonResultsToDelete.isEmpty()) {
			CompetitionResults competitionResultsToDelete1 = competitonResultsToDelete.get();
			this.competitionResultsRepo.delete(competitionResultsToDelete1);
			return true;
		}
		
		else {
			return false;
		}	
	}
	
	@Override
	public CompetitionResultsDto updateCompetitionResults(CompetitionResultsDto competitionResultsDto, String studentName) throws ResourceNotFoundException {
		
		Optional<CompetitionResults> CompetitionResultOptional = this.competitionResultsRepo.findByStudentName(studentName); 
		
		if(CompetitionResultOptional.isPresent()) {
			
			CompetitionResults competitionResultsToUpdate = CompetitionResultOptional.get();
			
			competitionResultsToUpdate.setStudentName(competitionResultsDto.getStudentName());
			competitionResultsToUpdate.setSchoolName(competitionResultsDto.getSchoolName());
			competitionResultsToUpdate.setCompetition(competitionResultsDto.getCompetition());
			competitionResultsToUpdate.setScore1(competitionResultsDto.getScore1());
			competitionResultsToUpdate.setStatus(competitionResultsDto.isStatus());
			
			this.competitionResultsRepo.save(competitionResultsToUpdate);
			
			return competitionResultsDtoToEntity.competitionResultsToDto(competitionResultsToUpdate);
			
		}
		
		else {
			String errorMessage = "competitionResults with Student Name " +studentName + "is not Available." ;
			
			throw new ResourceNotFoundException(errorMessage);
		}
	}


}
