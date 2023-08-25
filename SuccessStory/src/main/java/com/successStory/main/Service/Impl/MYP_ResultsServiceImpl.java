package com.successStory.main.Service.Impl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.successStory.main.Dto.MYP_ResultsDtoToEntity;
import com.successStory.main.Entities.MYP_Results;
import com.successStory.main.Payloads.IbdpResultDto;
import com.successStory.main.Payloads.MYP_ResultsDto;
import com.successStory.main.Repositories.MYP_ResultsRepo;
import com.successStory.main.Service.IbdpResultService;
import com.successStory.main.Service.MYP_ResultsService;

@Service
public class MYP_ResultsServiceImpl implements MYP_ResultsService{

	private final MYP_ResultsRepo myp_resultsRepo;
	private final MYP_ResultsDtoToEntity myp_resultsDtoToEntity;
	
	@Autowired
	public MYP_ResultsServiceImpl(MYP_ResultsRepo myp_resultsRepo, MYP_ResultsDtoToEntity myp_resultsDtoToEntity) {
		super();
		this.myp_resultsRepo = myp_resultsRepo;
		this.myp_resultsDtoToEntity = myp_resultsDtoToEntity;
	}
	
    @Override
	public MYP_ResultsDto addMYP_Result(MYP_ResultsDto myp_resultsDto) {
		
		MYP_Results myp_result = myp_resultsDtoToEntity.dtoToMYP_Results(myp_resultsDto);
		myp_result = myp_resultsRepo.save(myp_result);
		myp_resultsDto = myp_resultsDtoToEntity.myp_resultsToDto(myp_result);
		return myp_resultsDto;
	}

	@Override
	public List<MYP_ResultsDto> getAllMYP_Results() {
		List<MYP_Results> myp_results = this.myp_resultsRepo.findAll();
		List<MYP_ResultsDto> myp_resultsDto = myp_results
			    .stream()
			    .map(result -> this.myp_resultsDtoToEntity.myp_resultsToDto(result))
			    .collect(Collectors.toList());
		return myp_resultsDto;
	}

	@Override
	public boolean deleteAllMYP_Results() {

		List<MYP_Results> myp_resultToDelete = this.myp_resultsRepo.findAll();
		if(myp_resultToDelete.isEmpty()) {
			return false;
		}
		else this.myp_resultsRepo.deleteAll(myp_resultToDelete);
		return true;
	}

	

			
}
