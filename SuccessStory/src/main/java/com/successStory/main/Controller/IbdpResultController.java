package com.successStory.main.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.successStory.main.Payloads.IbdpResultDto;
import com.successStory.main.Service.IbdpResultService;

@CrossOrigin
@RestController
@RequestMapping("/api/ibdpResults")
public class IbdpResultController {
	
	@Autowired
	IbdpResultService ibdpResultService;
	
	@PostMapping
	public ResponseEntity<IbdpResultDto> addIbdpResul(@RequestBody IbdpResultDto ibdpResultDto) {
		IbdpResultDto addedIbdpResult = this.ibdpResultService.addIbdpResult(ibdpResultDto);
		return ResponseEntity.ok(addedIbdpResult);
	}
}
