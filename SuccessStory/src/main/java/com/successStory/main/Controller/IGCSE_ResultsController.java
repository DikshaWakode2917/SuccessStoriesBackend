package com.successStory.main.Controller;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.successStory.main.Payloads.IGCSE_ResultsDto;
import com.successStory.main.Repositories.IGCSE_ResultsRepo;
import com.successStory.main.Service.IGCSE_ResultsService;
import com.successStory.main.Service.Impl.ResourceNotFoundException;

@CrossOrigin
@RestController
@RequestMapping("/api/igcse_results")
@Component
public class IGCSE_ResultsController {

	@Autowired
	IGCSE_ResultsService igcse_resultsService;
	 
	@Autowired
	IGCSE_ResultsRepo igcse_resultsRepo;
	
	@PostMapping
	public ResponseEntity<IGCSE_ResultsDto> addIGCSE_Results(@RequestBody IGCSE_ResultsDto igcse_resultsDto) {
		IGCSE_ResultsDto addIGCSE_Result = this.igcse_resultsService.addIGCSE_Results(igcse_resultsDto);
		return ResponseEntity.ok(addIGCSE_Result);
	}
	
	@GetMapping
	public ResponseEntity<List<IGCSE_ResultsDto>> getAllIGCSE_Results() {
		return ResponseEntity.ok(this.igcse_resultsService.getAllIGCSE_Results());
	}
	
	@GetMapping("/{studentName}") 
	public ResponseEntity<?> findByStudentName(@PathVariable String studentName) {
		
		try {
			String decodeStudentName = URLDecoder.decode(studentName, StandardCharsets.UTF_8.toString());
			
			List<IGCSE_ResultsDto> igcs_resultsDtoList = this.igcse_resultsService.findResultsByStudentName(decodeStudentName);
			
			if(igcs_resultsDtoList != null && !igcs_resultsDtoList.isEmpty()) {
				return ResponseEntity.ok(igcs_resultsDtoList);
			}
			else {
				return ResponseEntity.notFound().build();
			}
		}
		
		catch(UnsupportedEncodingException e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error decoding URL parameter");
		}
	}
	
	@DeleteMapping()
	public ResponseEntity<Map<String, String>> deleteAllIGCSE_Results() {
		 List<IGCSE_ResultsDto> deletedAllIGCSE_Results = this.igcse_resultsService.getAllIGCSE_Results();
		 
		 this.igcse_resultsService.deleteAllIGCSE_Results();
		
		return ResponseEntity.ok(Map.of("message","Delete IGCSE_Results Successfully"));
	}
	
	@DeleteMapping("/{StudentName}")
	public ResponseEntity<?> deleteIGCSE_Result(@PathVariable String studentName) {
	    boolean success = this.igcse_resultsService.deleteSingleIGCSE_Results(studentName);

	    if (success) {
	        return ResponseEntity.ok(Map.of("message", "IGCSE_Results Deleted Successfully"));
	    } else {
	        Map<String, String> errorResponse = new HashMap<>();
	        errorResponse.put("message", "IGCSE_Results not Available");

	        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
	    }
	}

	@PutMapping("/{studentName}")
	public ResponseEntity<IGCSE_ResultsDto> updateIGCSE_Results(
			@PathVariable String studentName,
			@RequestBody IGCSE_ResultsDto igcse_resultsDto) throws ResourceNotFoundException {
		IGCSE_ResultsDto updatedIGCSE_Results = (IGCSE_ResultsDto) this.igcse_resultsService.updateIGCSE_Results(igcse_resultsDto, studentName);
		
		if(updatedIGCSE_Results != null) {
			return ResponseEntity.ok(updatedIGCSE_Results);
		}
		else {
			return ResponseEntity.notFound().build();
		}
	}
}
