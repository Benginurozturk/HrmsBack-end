package kodlamaio.Hrms.business.abstracts;


import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.JobPosition;

	public interface JobPositionService {

		Result add(JobPosition jobPosition);
//		Result update(JobPosition jobPosition);
//		Result delete(int id);
		
		DataResult<List<JobPosition>> getAll();
		DataResult<JobPosition> getJobByTitle(String title);
	}
