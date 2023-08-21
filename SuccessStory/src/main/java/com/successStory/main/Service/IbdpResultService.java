package com.successStory.main.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.successStory.main.Payloads.IbdpResultDto;

@Service
public interface IbdpResultService {

	//List<IbdpResultDto> getAllIbdpResult();
	IbdpResultDto addIbdpResult(IbdpResultDto ibdpResultDto);
	//IbdpResultDto updateIbdpResult(IbdpResultDto ibdpResultDto, String Student_Name);
	//IbdpResultDto deleteIbdpResul(IbdpResultDto ibdpResultDto,String Student_Name);
	//IbdpResultDto deleteAllIbdpResult(IbdpResultDto ibdpResultDto);
}
