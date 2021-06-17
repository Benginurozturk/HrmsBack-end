package kodlamaio.Hrms.dataAccess.abstracts;
import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.JobSeeker;
public interface JobSeekerDao extends JpaRepository<JobSeeker, Integer> {
	JobSeeker getBynationalId(String  nationality_id);
	JobSeeker getById(int id);
	//JobSeeker findByUserId(int id);
} 


