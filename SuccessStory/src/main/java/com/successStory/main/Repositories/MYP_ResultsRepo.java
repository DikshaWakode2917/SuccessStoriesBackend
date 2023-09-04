package com.successStory.main.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.successStory.main.Entities.MYP_Results;

@Repository
public interface MYP_ResultsRepo extends  JpaRepository <MYP_Results, Integer> {

    Optional<MYP_Results> findByStudentName(String studentName);
    MYP_Results deleteByStudentName(String studentName);
}
