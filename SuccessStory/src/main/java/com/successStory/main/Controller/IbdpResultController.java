package com.successStory.main.Controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;
import com.successStory.main.Payloads.IbdpResultDto;
import com.successStory.main.Service.IbdpResultService;
import com.successStory.main.Service.Impl.ResourceNotFoundException;

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

    @DeleteMapping("/{studentName}")
    public ResponseEntity<?> deleteIbdpResult(@PathVariable String studentName) {
        boolean success = this.ibdpResultService.deleteSingleIbdpResult(studentName);
        
        if (success) {
            return ResponseEntity.ok(Map.of("message", "IbdpResult Deleted Successfully"));
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(Map.of("message", "IbdpResult not Available"));
        }
    }

    @DeleteMapping()
    public ResponseEntity<Map<String, String>> deleteAllIbdpResult() {
        this.ibdpResultService.deleteAllIbdpResult();
        return ResponseEntity.ok(Map.of("message","Deleted All IBDP_Results Successfully"));
    }
    
    @PutMapping("/{studentName}")
    public ResponseEntity<IbdpResultDto> updateIbdpResult(
            @PathVariable String studentName,
            @RequestBody IbdpResultDto ibdpResultDto) throws ResourceNotFoundException {

        // Call the service to update the IbdpResult
        IbdpResultDto updatedIbdpResult = ibdpResultService.updateIbdpResult(ibdpResultDto, studentName);

        // Check if the update was successful
        if (updatedIbdpResult != null) {
            return ResponseEntity.ok(updatedIbdpResult);
        } else {
            // Return an error response if the update failed
            return ResponseEntity.notFound().build();
        }
    }
}
