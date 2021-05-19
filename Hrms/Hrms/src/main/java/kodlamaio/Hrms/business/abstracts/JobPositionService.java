package kodlamaio.Hrms.business.abstracts;


import java.util.List;

import kodlamaio.Hrms.entities.concretes.JobPosition;

	public interface JobPositionService {

	    List<JobPosition> getAll();
	}
