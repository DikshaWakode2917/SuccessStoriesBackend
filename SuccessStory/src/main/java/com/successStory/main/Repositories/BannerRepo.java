package com.successStory.main.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.successStory.main.Entities.Banner;

@Repository
public interface BannerRepo extends JpaRepository<Banner, Integer> {

}
