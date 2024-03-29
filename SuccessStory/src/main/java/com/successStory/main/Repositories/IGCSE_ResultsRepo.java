package com.successStory.main.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.successStory.main.Entities.IGCSE_Results;

@Repository
public interface IGCSE_ResultsRepo extends JpaRepository<IGCSE_Results, Integer> {
	
	Optional<IGCSE_Results> findByStudentName(String studentName);
	IGCSE_Results deleteByStudentName(String studentName);
}
