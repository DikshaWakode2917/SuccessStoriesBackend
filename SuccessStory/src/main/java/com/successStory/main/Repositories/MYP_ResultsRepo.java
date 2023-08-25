package com.successStory.main.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.successStory.main.Entities.MYP_Results;

@Repository
public interface MYP_ResultsRepo extends  JpaRepository <MYP_Results, Integer> {

	
}
