package com.successStory.main.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.successStory.main.Entities.IbdpResult;

@Repository("ibdpResultRepo")
public interface IbdpResultRepo extends JpaRepository <IbdpResult, Integer> {

	//IbdpResult findByStudentName(IbdpResultDto ibdpResultDto, String student_Name);
	

	//Object getStudent_id(String student_name);

	//	@Query("SELECT r.studentName FROM IbdpResult r WHERE r.studentName = :studentName1")
	//	IbdpResult findByStudentName(@Param("studentName1") String studentName1);

}
