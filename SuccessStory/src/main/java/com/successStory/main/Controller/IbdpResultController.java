package com.successStory.main.Controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import com.successStory.main.Payloads.IbdpResultDto;
import com.successStory.main.Service.IbdpResultService;

@CrossOrigin
@RestController
@RequestMapping("/api/ibdpResults")
@Component
public class IbdpResultController {

    @Autowired
    private IbdpResultService ibdpResultService;

    @PostMapping
    public ResponseEntity<IbdpResultDto> addIbdpResult(@RequestBody IbdpResultDto ibdpResultDto) {
        IbdpResultDto addedIbdpResult = this.ibdpResultService.addIbdpResult(ibdpResultDto);
        return ResponseEntity.ok(addedIbdpResult);
    }
    
    @GetMapping
    public ResponseEntity<List<IbdpResultDto>> getAllIbdpResults() {
    	return ResponseEntity.ok(this.ibdpResultService.getAllIbdpResults());
    }
    
//    @GetMapping("/{student_Name}")
//    public ResponseEntity<IbdpResultDto> findByStudentName(@PathVariable String studentName) {
//        List<IbdpResultDto> ibdpResultDto = this.ibdpResultService.findByStudentName(studentName);
//        
//        if (ibdpResultDto != null) {
//            return ResponseEntity.ok(List<ibdpResultDto>);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }
//    
//    @GetMapping("/{studentName}")
//    public ResponseEntity<List<IbdpResultDto>> findByStudentName(@PathVariable String studentName) {
//        List<IbdpResultDto> ibdpResultDtoList = this.ibdpResultService.findByStudentName(studentName);
//        
//        if (ibdpResultDtoList != null && !ibdpResultDtoList.isEmpty()) {
//            return ResponseEntity.ok(ibdpResultDtoList);
//        } else {
//            return ResponseEntity.notFound().build();
//        }
//    }

    @GetMapping("/{studentName}")
    public ResponseEntity<?> findByStudentName(@PathVariable String studentName) {
        try {
            String decodedStudentName = URLDecoder.decode(studentName, StandardCharsets.UTF_8.toString());
            
            // Now, you can use the decodedStudentName in your logic to retrieve results.
            List<IbdpResultDto> ibdpResultDtoList = this.ibdpResultService.findByStudentName(decodedStudentName);
            
            if (ibdpResultDtoList != null && !ibdpResultDtoList.isEmpty()) {
                return ResponseEntity.ok(ibdpResultDtoList);
            } else {
                return ResponseEntity.notFound().build();
            }
        } catch (UnsupportedEncodingException e) {
            // Handle the exception (e.g., log an error, return an error response)
            //return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error decoding URL parameter");
        	return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error decoding URL parameter");
        }
    }
   

//    @PutMapping("/{student_Name}")
//    public ResponseEntity<IbdpResultDto> updateIbdpResult(@RequestBody IbdpResultDto ibdpResultDto, @PathVariable("student_Name") String student_Name) {
//        IbdpResultDto updatedIbdpResult = this.ibdpResultService.updateIbdpResult(ibdpResultDto, student_Name);
//        return ResponseEntity.ok(updatedIbdpResult);
//    }
//    

   
//    @DeleteMapping("/{student_Name}")
//    public ResponseEntity<IbdpResultDto> deleteIbdpResult(@PathVariable IbdpResultDto ibdpResultDto, String student_Name) {
//    	boolean success = this.ibdpResultService.deleteIbdpResult(ibdpResultDto, student_Name);
//		if(success) {
//			return new ResponseEntity(Map.of("message","IbdpResult Deleted Successfully"),HttpStatus.OK);   //Use when not create ApiResponse class
//		}
//		else {
//			return new ResponseEntity(Map.of("message","IbdpResult not Available"),HttpStatus.NOT_FOUND);  
//		}
//
//    }
    
    @DeleteMapping()
    public List<IbdpResultDto> deleteAllIbdpResult() {
        List<IbdpResultDto> deletedIbdpResults = this.ibdpResultService.getAllIbdpResults();
        this.ibdpResultService.deleteAllIbdpResult();
        return deletedIbdpResults;
    }

}
