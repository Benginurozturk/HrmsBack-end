package kodlamaio.Hrms.business.abstracts;

import java.util.List;

import kodlamaio.Hrms.core.utilities.results.DataResult;
import kodlamaio.Hrms.entities.concretes.JobType;

public interface JobTypeService {

    DataResult<List<JobType>> getAll();

    boolean isExistById(int id);

}
