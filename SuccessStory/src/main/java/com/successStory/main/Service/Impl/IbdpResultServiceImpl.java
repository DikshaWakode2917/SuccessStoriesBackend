package com.successStory.main.Service.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.courses.backend.exceptions.ResourceNotFoundException;
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
        IbdpResult ibdpResult = ibdpResultDtoToEntity.dtoToIbdpResult(ibdpResultDto);
        ibdpResult = ibdpResultRepo.save(ibdpResult);
        ibdpResultDto = ibdpResultDtoToEntity.ibpdResultToDto(ibdpResult);
        return ibdpResultDto;
    }

//    @Override
//    public IbdpResultDto getSingleIbdpResult(IbdpResultDto ibdpResultDto, String student_Name) {
//        IbdpResult ibdpResult = this.ibdpResultRepo.findByStudentName(student_Name);
//
//        if (ibdpResult == null) {
//            throw new ResourceNotFoundException("IbdpResult", "Student_Name", student_Name);
//        }
//
//        return this.ibdpResultDtoToEntity.ibpdResultToDto(ibdpResult);
//    }
//
//    @Override
//    public List<IbdpResultDto> getAllIbdpResults() {
//        List<IbdpResult> ibdpResults = this.ibdpResultRepo.findAll();
//        List<IbdpResultDto> ibdpResultDto = ibdpResults.stream()
//                .map(ibdpResult -> this.ibdpResultDtoToEntity.ibpdResultToDto(ibdpResult))
//                .collect(Collectors.toList());
//        return ibdpResultDto;
//    }
//
//    @Override
//    public IbdpResultDto updateIbdpResult(IbdpResultDto ibdpResultDto, String student_name) {
//        IbdpResult ibdpResult = this.ibdpResultRepo.findByStudentName(student_name);
//
//        if (ibdpResult == null) {
//            throw new ResourceNotFoundException("IbdpResult", "Student_name", student_name);
//        }
//
//        ibdpResult.setStudent_Name(ibdpResultDto.getStudent_Name());
//        ibdpResult.setSchool_Name(ibdpResultDto.getSchool_Name());
//        ibdpResult.setYear(ibdpResultDto.getYear());
//        ibdpResult.setLevel(ibdpResultDto.getLevel());
//        ibdpResult.setScore(ibdpResultDto.getScore());
//        ibdpResult.setIA_Score(ibdpResultDto.getIA_Score());
//        ibdpResult.setStatus(ibdpResultDto.isStatus());
//
//        IbdpResult updatedIbdpResult = this.ibdpResultRepo.save(ibdpResult);
//        IbdpResultDto ibdpResultDto1 = this.ibdpResultDtoToEntity.ibpdResultToDto(updatedIbdpResult);
//        return ibdpResultDto1;
//    }
//
//    @Override
//    public IbdpResultDto deleteIbdpResult(IbdpResultDto ibdpResultDto, String student_Name) {
//        IbdpResult ibdpResult = this.ibdpResultRepo.findByStudentName(student_Name);
//
//        if (ibdpResult == null) {
//            throw new ResourceNotFoundException("IbdpResult", "Student_name", student_Name);
//        }
//
//        IbdpResultDto deletedDto = this.ibdpResultDtoToEntity.ibpdResultToDto(ibdpResult);
//        this.ibdpResultRepo.delete(ibdpResult);
//        return deletedDto;
//    }
//
//    @Override
//    public boolean deleteAllIbdpResult() {
//        List<IbdpResult> ibdpResultsToDelete = this.ibdpResultRepo.findAll();
//
//        if (ibdpResultsToDelete.isEmpty()) {
//            return false;
//        }
//
//        this.ibdpResultRepo.deleteAll(ibdpResultsToDelete);
//        return true;
//    }
}
