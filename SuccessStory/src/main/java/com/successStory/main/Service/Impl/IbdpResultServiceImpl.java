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
	
	private final IbdpResultRepo ibdpResultRepo;
    private final IbdpResultDtoToEntity ibdpResultDtoToEntity;

    @Autowired
    public IbdpResultServiceImpl(IbdpResultRepo ibdpResultRepo, IbdpResultDtoToEntity ibdpResultDtoToEntity) {
        this.ibdpResultRepo = ibdpResultRepo;
        this.ibdpResultDtoToEntity = ibdpResultDtoToEntity;
    }

    @Override
    public IbdpResultDto addIbdpResult(IbdpResultDto ibdpResultDto) {
        // Convert the DTO to an entity
        IbdpResult ibdpResult = ibdpResultDtoToEntity.dtoToIbdpResult(ibdpResultDto);
        
        // Save the entity to the repository
        ibdpResult = ibdpResultRepo.save(ibdpResult);
        
        // Convert the saved entity back to a DTO
        return ibdpResultDtoToEntity.ibpdResultToDto(ibdpResult);
    }
//	@Override
//	public IbdpResultDto addIbdpResult (IbdpResultDto ibdpResultDto) {
//		IbdpResult ibdpResult = ibdpResultDtoToEntity.dtoToIbdpResult(ibdpResultDto);
//		ibdpResult = this.ibdpResultRepo.save(ibdpResult);
//		
//		return this.ibdpResultDtoToEntity.ibpdResultToDto(ibdpResult);
	//}
}
