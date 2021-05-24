package kodlamaio.Hrms.business.abstracts;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.core.utilities.results.Result;
import kodlamaio.Hrms.entities.concretes.Employer;
import java.util.List;

public interface EmployerService {
	DataResult<List<Employer>> getAll();
	Result add(Employer employer);
//	Result update(Employer employer);
//	Result delete(int id);
}
