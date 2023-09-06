
package com.successStory.main.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.successStory.main.Payloads.BannerDto;
import com.successStory.main.Service.BannerService;

@CrossOrigin
@RestController
@RequestMapping("/api/banners")
public class BannerController {
	
	@Autowired
	BannerService bannerService;
	
	@PostMapping
	public ResponseEntity<BannerDto> createBanner (@RequestBody BannerDto bannerDto){
		BannerDto createdBanner = this.bannerService.addBanner(bannerDto);
		return ResponseEntity.ok(createdBanner);
	}
	
	@GetMapping
	public List<BannerDto> getBanners() {
	    List<BannerDto> bannerDto = bannerService.getAllBanners(); // Replace with your service method
	    return bannerDto;
	}
	
	@DeleteMapping
	public ResponseEntity<String> deleteBanner() {
	    BannerDto bannerDto = bannerService.deleteBanner(); // Replace with your service method
	    
	    if(bannerDto != null) {
	    	
		    return ResponseEntity.ok("Banner Delete Successfully");
	    }
	    else {
	    	return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Banner Not Found");	    
	} 
  }
}



