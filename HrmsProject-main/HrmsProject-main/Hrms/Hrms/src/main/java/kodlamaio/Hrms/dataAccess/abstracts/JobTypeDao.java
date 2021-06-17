package kodlamaio.Hrms.dataAccess.abstracts;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kodlamaio.Hrms.entities.concretes.JobType;

@Repository
public interface JobTypeDao extends JpaRepository<JobType, Integer> {

}
