package com.successStory.main.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.successStory.main.Entities.Banner;

public interface BannerRepo extends JpaRepository<Banner, Integer> {

}
