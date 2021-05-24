package kodlamaio.Hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;

import kodlamaio.Hrms.entities.concretes.JobPosition;

public interface JobPositionDao  extends JpaRepository<JobPosition, Integer> {
	JobPosition findJobByTitle(String position_name);
}