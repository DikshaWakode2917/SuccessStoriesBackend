package com.successStory.main.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.successStory.main.Payloads.IbdpResultDto;

@Service
public interface IbdpResultService {

	IbdpResultDto addIbdpResult(IbdpResultDto ibdpResultDto);
	List<IbdpResultDto> getAllIbdpResults();
	List<IbdpResultDto> findByStudentName(String studentName);
	IbdpResultDto updateIbdpResult(IbdpResultDto ibdpResultDto, String studentName);
	boolean deleteSingleIbdpResult(String studentName);
	boolean deleteAllIbdpResult();
}

