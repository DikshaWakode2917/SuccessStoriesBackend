package com.successStory.main.Controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.successStory.main.Payloads.IbdpResultDto;
import com.successStory.main.Service.IbdpResultService;

@CrossOrigin
@RestController
@RequestMapping("/api/ibdpResults")
public class IbdpResultController {

    @Autowired
    IbdpResultService ibdpResultService;

    @PostMapping
    public ResponseEntity<IbdpResultDto> addIbdpResult(@RequestBody IbdpResultDto ibdpResultDto) {
        IbdpResultDto addedIbdpResult = this.ibdpResultService.addIbdpResult(ibdpResultDto);
        return ResponseEntity.ok(addedIbdpResult);
    }

//    @PutMapping("/{student_Name}")
//    public ResponseEntity<IbdpResultDto> updateIbdpResult(@RequestBody IbdpResultDto ibdpResultDto, @PathVariable("student_Name") String student_Name) {
//        IbdpResultDto updatedIbdpResult = this.ibdpResultService.updateIbdpResult(ibdpResultDto, student_Name);
//        return ResponseEntity.ok(updatedIbdpResult);
//    }
//    
//    @GetMapping("/{student_Name}")
//    public ResponseEntity<IbdpResultDto> getSingleIbdpResult(@PathVariable IbdpResultDto ibdpResultDto, String student_Name) {
//    	return ResponseEntity.ok(this.ibdpResultService.getSingleIbdpResult(ibdpResultDto, student_Name));
//    }
//    
//    @GetMapping
//    public ResponseEntity<List<IbdpResultDto>> getAllIbdpResults() {
//    	return ResponseEntity.ok(this.ibdpResultService.getAllIbdpResults());
//    }
////    
////    @DeleteMapping("/{student_Name}")
////    public ResponseEntity<IbdpResultDto> deleteIbdpResult(@PathVariable IbdpResultDto ibdpResultDto, String student_Name) {
////    	IbdpResultDto success = this.ibdpResultService.deleteIbdpResult(ibdpResultDto, student_Name);
////		if(success) {
////			return new ResponseEntity(Map.of("message","IbdpResult Deleted Successfully"),HttpStatus.OK);   //Use when not create ApiResponse class
////		}
////		else {
////			return new ResponseEntity(Map.of("message","IbdpResult not Available"),HttpStatus.NOT_FOUND);  
////
////		}
//
//   // }
//    
//    @DeleteMapping("/delete-all")
//    public List<IbdpResultDto> deleteAllIbdpResult() {
//        List<IbdpResultDto> deletedIbdpResults = this.ibdpResultService.getAllIbdpResults();
//        this.ibdpResultService.deleteAllIbdpResult();
//        return deletedIbdpResults;
//    }

}
