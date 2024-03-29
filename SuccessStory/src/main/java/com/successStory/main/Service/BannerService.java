package com.successStory.main.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.successStory.main.Payloads.BannerDto;

@Service
public interface BannerService {
	
	List<BannerDto> getAllBanners();
	BannerDto addBanner(BannerDto bannerDto);
	BannerDto deleteBanner();
}
