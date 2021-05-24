package kodlamaio.Hrms.business.abstracts;
import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.Job;

public interface JobService {
	DataResult<List<Job>> getAll();
	Result add(Job job);
}
