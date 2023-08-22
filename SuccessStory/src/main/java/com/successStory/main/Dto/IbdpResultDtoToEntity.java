package com.successStory.main.Dto;

import com.successStory.main.Entities.IbdpResult;
import com.successStory.main.Payloads.IbdpResultDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.successStory.main.Dto.IbdpResultDtoToEntity;
import com.successStory.main.Repositories.IbdpResultRepo;
import com.successStory.main.Service.IbdpResultService;


@Component
public class IbdpResultDtoToEntity {
	
	public IbdpResult dtoToIbdpResult(IbdpResultDto ibdpResultDto) {
		IbdpResult ibdpResult = new IbdpResult();

		ibdpResult.setStudent_Name(ibdpResultDto.getStudent_Name());
		ibdpResult.setSchool_Name(ibdpResultDto.getSchool_Name());
		ibdpResult.setYear(ibdpResultDto.getYear());
		ibdpResult.setLevel(ibdpResultDto.getLevel());
		ibdpResult.setScore(ibdpResultDto.getScore());
		ibdpResult.setIA_Score(ibdpResultDto.getIA_Score());
		ibdpResult.setStatus(ibdpResultDto.isStatus());
		return ibdpResult;
	}
	
	public IbdpResultDto ibpdResultToDto (IbdpResult ibdpResult) {
		IbdpResultDto ibdpResultDto = new IbdpResultDto();
		ibdpResultDto.setStudent_Name(ibdpResult.getStudent_Name());
		ibdpResultDto.setSchool_Name(ibdpResult.getSchool_Name());
		ibdpResultDto.setYear(ibdpResult.getYear());
		ibdpResultDto.setLevel(ibdpResult.getLevel());
		ibdpResultDto.setScore(ibdpResult.getScore());
		ibdpResultDto.setIA_Score(ibdpResult.getIA_Score());
		ibdpResultDto.setStatus(ibdpResult.isStatus());
		return ibdpResultDto;
	}
}
