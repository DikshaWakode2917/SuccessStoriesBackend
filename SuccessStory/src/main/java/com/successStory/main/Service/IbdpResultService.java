package com.successStory.main.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.successStory.main.Payloads.IbdpResultDto;

@Service
public interface IbdpResultService {

	//List<IbdpResultDto> getAllIbdpResults();
	//IbdpResultDto getSingleIbdpResult(IbdpResultDto ibdpResultDto,String student_Name);
	IbdpResultDto addIbdpResult(IbdpResultDto ibdpResultDto);
	//IbdpResultDto updateIbdpResult(IbdpResultDto ibdpResultDto, String student_Name);
	//IbdpResultDto deleteIbdpResult(IbdpResultDto ibdpResultDto,String student_Name);
	//boolean deleteAllIbdpResult();
}

//Object getById(String student_name);
