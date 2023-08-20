package com.successStory.main.Service.Impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.successStory.main.Dto.BannerDtoToEntity;
import com.successStory.main.Entities.Banner;
import com.successStory.main.Payloads.BannerDto;
import com.successStory.main.Repositories.BannerRepo;
import com.successStory.main.Service.BannerService;

@Service
public class BannerServiceImpl implements BannerService {

	@Autowired
	private BannerRepo bannerRepo;
	@Autowired
	private BannerDtoToEntity bannerDtoToEntity;
	
	@Override
	public BannerDto addBanner(BannerDto bannerDto) {
		Banner newBanner = bannerDtoToEntity.dtoToBanner(bannerDto);
		List<Banner> banners = this.bannerRepo.findAll();
		if (banners.size() == 0) {
			newBanner = this.bannerRepo.save(newBanner);
		} else {
			banners.get(0).setBanner_heading(newBanner.getBanner_heading());
			banners.get(0).setBanner_text(newBanner.getBanner_text());
			banners.get(0).setButton_text(newBanner.getButton_text());
			banners.get(0).setButton_url(newBanner.getButton_url());
			banners.get(0).setStatus(newBanner.isStatus());
			
			newBanner = this.bannerRepo.save(banners.get(0));
		}
		
		
		return this.bannerDtoToEntity.bannerToDto(newBanner);
	}
	
	@Override
	public List<BannerDto> getAllBanners(){
		List<Banner> banners = this.bannerRepo.findAll();
		List<BannerDto> bannerDto = banners.stream().map(banner->this.bannerDtoToEntity.bannerToDto(banner)).collect(Collectors.toList());
		return bannerDto;
	}
	
	public BannerDto deleteBanner() {
		List<Banner> banners = this.bannerRepo.findAll();
				
		if (banners.size() > 0 ) {
			this.bannerRepo.deleteAll();
		} else {
			return null;
		}
		
		return this.bannerDtoToEntity.bannerToDto(banners.get(0));
	}
}




