package kodlamaio.Hrms.business.abstracts;
import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
//import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {

//	Result add(Employee employee);
//	Result update(Employee employee);
//	Result delete(int id);
//	DataResult<Employee> getById(int id);
	
	DataResult<List<JobSeeker>> getAll();
}