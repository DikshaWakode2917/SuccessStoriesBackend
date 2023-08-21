package com.successStory.main.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.successStory.main.Entities.IbdpResult;

@Repository("ibdpResultRepo")
public interface IbdpResultRepo extends JpaRepository <IbdpResult, Integer> {

}
