package com.successStory.main.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.successStory.main.Entities.IGCSE_Results;
import com.successStory.main.Payloads.IGCSE_ResultsDto;
import com.successStory.main.Service.Impl.ResourceNotFoundException;

@Service
public interface IGCSE_ResultsService {

	IGCSE_ResultsDto addIGCSE_Results(IGCSE_ResultsDto igcse_resultsDto);
	List<IGCSE_ResultsDto> getAllIGCSE_Results();
	List<IGCSE_Results> updateIGCSE_Results(IGCSE_ResultsDto igcse_resultsDto, String studentName) throws ResourceNotFoundException;
    List<IGCSE_ResultsDto> findResultsByStudentName(String studentName);
	boolean deleteAllIGCSE_Results();
	boolean deleteSingleIGCSE_Results(String studentName);
}
