package com.successStory.main.Service;

import java.util.List;

import com.successStory.main.Payloads.MYP_ResultsDto;

public interface MYP_ResultsService {

	MYP_ResultsDto addMYP_Result(MYP_ResultsDto myp_resultsDto);
	List<MYP_ResultsDto> getAllMYP_Results();
//	MYP_ResultsDto getSingleMYP_Result(MYP_ResultsDto myp_resultsDto, String student_Name);
//	MYP_ResultsDto updateMYP_Results(MYP_ResultsDto myp_resultsDto, String student_Name);
	boolean deleteAllMYP_Results();
//	MYP_ResultsDto deleteSingleMYP_Result(MYP_ResultsDto myp_resultsDto, String student_Name);
	
}
