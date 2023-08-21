package com.successStory.main.Service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.successStory.main.Dto.IbdpResultDtoToEntity;
import com.successStory.main.Entities.IbdpResult;
import com.successStory.main.Payloads.IbdpResultDto;
import com.successStory.main.Repositories.IbdpResultRepo;
import com.successStory.main.Service.IbdpResultService;

@Service
public class IbdpResultServiceImpl implements IbdpResultService {
	@Autowired
	private IbdpResultRepo ibdpResultRepo;
	@Autowired
	private IbdpResultDtoToEntity ibdpResultDtoToEntity;
	
	@Override
	public IbdpResultDto addIbdpResult (IbdpResultDto ibdpResultDto) {
		IbdpResult ibdpResult = ibdpResultDtoToEntity.dtoToIbdpResult(ibdpResultDto);
		ibdpResult = this.ibdpResultRepo.save(ibdpResult);
		
		return this.ibdpResultDtoToEntity.ibpdResultToDto(ibdpResult);
	}
}
