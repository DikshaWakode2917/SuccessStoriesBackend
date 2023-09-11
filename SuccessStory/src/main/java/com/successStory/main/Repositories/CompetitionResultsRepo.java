package com.successStory.main.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.successStory.main.Entities.CompetitionResults;

@Repository
public interface CompetitionResultsRepo extends JpaRepository<CompetitionResults , Integer>{

	Optional<CompetitionResults> findByStudentName(String studentName);
	CompetitionResults deleteByStudentName(String studentName);
}
