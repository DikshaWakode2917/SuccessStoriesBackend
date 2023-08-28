package com.successStory.main.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.successStory.main.Entities.IbdpResult;

public interface IbdpResultRepo extends JpaRepository<IbdpResult, Integer> {
	
    List<IbdpResult> findByStudentName(String studentName);
}


	//IbdpResult findByStudent_Name(String Student_Name);
	//@Query("select result from Ibdp_Result result WHERE result.StudentName = :studentName")
	
//	@Query("select u From IbdpResult u WHERE u.studentName= : n")
//	public List<IbdpResult> findByStudentName(String studentName);
	//List<IbdpResult> findByStudentName(String studentName);


	//Object getStudent_id(String student_name);

	//	@Query("SELECT r.studentName FROM IbdpResult r WHERE r.studentName = :studentName1")
	//	IbdpResult findByStudentName(@Param("studentName1") String studentName1);

//}
