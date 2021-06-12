package kodlamaio.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.ResumeExperience;
public interface ResumeExperienceDao extends JpaRepository<ResumeExperience, Integer> {

	
}
