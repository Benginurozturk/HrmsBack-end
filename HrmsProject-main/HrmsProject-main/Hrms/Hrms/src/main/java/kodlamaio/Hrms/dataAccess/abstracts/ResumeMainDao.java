package kodlamaio.Hrms.dataAccess.abstracts;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


import kodlamaio.Hrms.entities.concretes.ResumeMain;

public interface ResumeMainDao extends JpaRepository<ResumeMain, Integer> {
	
	List<ResumeMain> findAllByjobSeeker_Id(int id); 
	ResumeMain getById(int resumeMainId);
	
}
