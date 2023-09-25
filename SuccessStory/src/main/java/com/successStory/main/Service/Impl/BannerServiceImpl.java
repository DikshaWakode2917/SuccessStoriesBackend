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
		Banner bannerEntity = new Banner();
		List<Banner> banners = this.bannerRepo.findAll();
		
		if (banners.isEmpty()) {
			bannerEntity = bannerDtoToEntity.dtoToBanner(bannerDto);
		} else {
			bannerEntity = banners.get(0);
			if (bannerDto.getBanner_heading() != null) {
				bannerEntity.setBanner_heading(bannerDto.getBanner_heading());
			}
			if (bannerDto.getBanner_text() != null) {
				bannerEntity.setBanner_text(bannerDto.getBanner_text());
			}
			if (bannerDto.getButton_text() != null) {
				bannerEntity.setButton_text(bannerDto.getButton_text());
			}
			if (bannerDto.getButton_url() != null) {
				bannerEntity.setButton_url(bannerDto.getButton_url());
			}
			if (bannerDto.isStatus()) {
				bannerEntity.setStatus(bannerDto.isStatus());
			}
		}
		
		bannerEntity = this.bannerRepo.save(bannerEntity);
		
		return this.bannerDtoToEntity.bannerToDto(bannerEntity);
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




